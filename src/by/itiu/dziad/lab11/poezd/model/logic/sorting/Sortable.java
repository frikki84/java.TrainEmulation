/**
 * interface for Pattern Strategy to sort carriages in train
 */
package by.itiu.dziad.lab11.poezd.model.logic.sorting;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.GeneralCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.train.Train;

public interface Sortable {
	public GeneralCarriage [] sort(Train train);

}
