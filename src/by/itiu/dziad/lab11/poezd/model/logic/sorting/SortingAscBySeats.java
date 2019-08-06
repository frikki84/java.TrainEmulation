/**
 * realization Pattern Strategy to sort carriages in train
 */

package by.itiu.dziad.lab11.poezd.model.logic.sorting;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.GeneralCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.train.Train;

public class SortingAscBySeats implements Sortable {
	@Override
	public GeneralCarriage [] sort (Train train) {
		int j = train.getCountCarriages();
		while (j > 0) {
			for (int i = 0; i < j - 1; i++) {
				if (train.getTrain()[i].getSeatsNumber() > train.getTrain()[i + 1].getSeatsNumber()) {
					GeneralCarriage ch = train.getTrain()[i];
					train.getTrain()[i] = train.getTrain()[i + 1];
					train.getTrain()[i + 1] = ch;
				}
			}
			j--;
		}
		return train.getTrain();
	}

	

}
