/**
 * for Pattern Strategy to add carriage group
 */
package by.itiu.dziad.lab11.poezd.model.logic.adding;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.EconomClassCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.train.Train;
import by.itiu.dziad.lab11.poezd.model.logic.communication.Communication;

public class AddingEconomCarriage extends Communication implements Addable {

	@Override
	public Train addCarriagesGroup(Train train) {
		int carriageNumber = super.askCarriageNumber(train, "econom");
			
		while (carriageNumber > 0) {
			train.addCarriage(new EconomClassCarriage());
			carriageNumber--;
		}
		return train;
	}

}
