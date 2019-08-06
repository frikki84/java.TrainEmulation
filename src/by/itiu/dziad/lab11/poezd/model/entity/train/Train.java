package by.itiu.dziad.lab11.poezd.model.entity.train;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.*;
import by.itiu.dziad.lab11.poezd.model.logic.adding.Addable;
import by.itiu.dziad.lab11.poezd.model.logic.adding.AddingGeneralCarriage;
import by.itiu.dziad.lab11.poezd.model.logic.sorting.Sortable;
import by.itiu.dziad.lab11.poezd.model.logic.sorting.SortingAscBySeats;

import java.util.Arrays;

public class Train {
	public static final int MIN_TRAIN_LENGTH = 1;
	public static final int MAX_TRAIN_LENGTH = 22;
	public static final int MIN_COUNT_CARRIGES_VALUE = 0;

	Sortable sorting = new SortingAscBySeats();  //pattern Strategy for sorting carriages in train
	Addable adding = new AddingGeneralCarriage();  //pattern Strategy for adding group of carriages in train
	

	private GeneralCarriage[] train;

	private int countCarriages = MIN_COUNT_CARRIGES_VALUE;

	public Train() {
		train = new GeneralCarriage[MAX_TRAIN_LENGTH];
	}

	public Train(int countCarriages) {
		train = new GeneralCarriage[countCarriages];
	}

	public Train(GeneralCarriage[] train) {
		this.train = train;
		countCarriages = train.length;

	}

	
	public int getCountCarriages() {
		return countCarriages;
	}

	public GeneralCarriage[] getTrain() {
		return train;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countCarriages;
		result = prime * result + Arrays.hashCode(train);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (countCarriages != other.countCarriages)
			return false;
		if (!Arrays.equals(train, other.train))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String string = "Train \n" + "[countCarriages = " + countCarriages + ": \n";
		for (int i = 0; i < train.length; i++) {
			if (train[i] != null) {
				string += train[i] + " ";
			} else {
				break;
			}

		}
		return string += "]";
	}
	

	public void addCarriage(GeneralCarriage carriage) {
		if (countCarriages < train.length) {
			train[countCarriages++] = carriage;
		}
	}
	
	public Train performAddingCarriagesGroup(Train train) {
		return adding.addCarriagesGroup(train);
	}
	
	public void setAdding(Addable adding) {
		this.adding = adding;
	}

	public GeneralCarriage [] performSorting(Train train) {
		return sorting.sort(train);
	}
	
	
	public void setSorting(Sortable sorting) {
		this.sorting = sorting;
	}
	

}
