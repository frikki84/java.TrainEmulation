package by.itiu.dziad.lab11.poezd.controller;

import org.apache.log4j.BasicConfigurator;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.SleepingCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.train.Train;
import by.itiu.dziad.lab11.poezd.model.logic.adding.AddingEconomCarriage;
import by.itiu.dziad.lab11.poezd.model.logic.adding.AddingPostCarriage;
import by.itiu.dziad.lab11.poezd.model.logic.communication.Communication;
import by.itiu.dziad.lab11.poezd.model.logic.sorting.SortingDecsByCost;
import by.itiu.dziad.lab11.poezd.view.ConsolePrinter;

public class Controller {
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		int countCarriages = Communication.askTrainLength();
		
		Train train = new Train(countCarriages);

		train.performAddingCarriagesGroup(train);

		train.setAdding(new AddingEconomCarriage());

		train.performAddingCarriagesGroup(train);

		train.setAdding(new AddingPostCarriage());

		train.performAddingCarriagesGroup(train);

		train.addCarriage(new SleepingCarriage());

				
		train.setSorting(new SortingDecsByCost());
		
		train.performSorting(train);

		ConsolePrinter.print("" + train);

	}

}
