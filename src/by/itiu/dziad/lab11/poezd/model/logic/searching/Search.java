package by.itiu.dziad.lab11.poezd.model.logic.searching;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.*;
import by.itiu.dziad.lab11.poezd.model.entity.train.Train;


public class Search {

	public static GeneralCarriage[] searchCarriageSeatsNumber(Train train, int valueMin, int valueMax) {
		GeneralCarriage[] searchContainer = new GeneralCarriage[train.getCountCarriages()];
		int count= 0;
		for (int i = 0; i < train.getCountCarriages(); i++) {
			if (train.getTrain()[i].getSeatsNumber() >= valueMin && train.getTrain()[i].getSeatsNumber() <= valueMax) {
				searchContainer[count] = train.getTrain()[i];
				count ++;
			}
		}
		return searchContainer;
	}

	public static GeneralCarriage[] searchCarriageOneZoneCost(Train train, double valueMin, double valueMax) {
		GeneralCarriage[] searchContainer = new GeneralCarriage[train.getCountCarriages()];
		int count= 0;
		for (int i = 0; i < train.getCountCarriages(); i++) {
			if (train.getTrain()[i].getAdultPassagerOneZoneCost() >= valueMin
					&& train.getTrain()[i].getAdultPassagerOneZoneCost() <= valueMax) {
				searchContainer[count] = train.getTrain()[i];
				count++;
			}
		}

		return searchContainer;

	}
}
