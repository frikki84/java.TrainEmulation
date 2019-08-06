package by.itiu.dziad.lab11.poezd.model.logic.validation;

import by.itiu.dziad.lab11.poezd.model.entity.train.Train;
import by.itiu.dziad.lab11.poezd.model.userInput.UserInput;

public class Validator {

	public static int checkTrainLength(int countCarriages) {
		while (countCarriages < Train.MIN_TRAIN_LENGTH || countCarriages > Train.MAX_TRAIN_LENGTH) {
			countCarriages = UserInput.inputInt("Error!!! Enter the number more than 0 and less than 23: ");
		}

		return countCarriages;
	}

	public static int checkCarriageCount(Train train, int carriageCount) {
		while (carriageCount > train.getTrain().length - train.getCountCarriages() || carriageCount < 0) {
			carriageCount = UserInput.inputInt("The carriage's number is more then it's allowed. Try again: ");

		}
		return carriageCount;
	}

}
