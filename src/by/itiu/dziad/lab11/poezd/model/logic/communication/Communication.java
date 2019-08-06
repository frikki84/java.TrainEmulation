/**
 * class for communication with user about number of carriages and checking this information
 */

package by.itiu.dziad.lab11.poezd.model.logic.communication;

import by.itiu.dziad.lab11.poezd.model.entity.train.Train;
import by.itiu.dziad.lab11.poezd.model.logic.validation.Validator;
import by.itiu.dziad.lab11.poezd.model.userInput.UserInput;

public class Communication {
	static String msg = "How many %s carriages would you like to add? Max number is %d: ";
		
	public static int askCarriageNumber(Train train, String typeCarriageMsg) {
		int carriageNumber = UserInput.inputInt(msg, typeCarriageMsg,
				train.getTrain().length - train.getCountCarriages());

		carriageNumber = Validator.checkCarriageCount(train, carriageNumber);
		
		return carriageNumber;
		
	}
	
	public static int askTrainLength() {
		int countCarriages = UserInput
				.inputInt("Enter the count of carriages in your train (more than 0 and less than 23): ");
		countCarriages = Validator.checkTrainLength(countCarriages);
		
		return countCarriages;

	}

}
