package by.itiu.dziad.lab11.poezd.model.logic.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.EconomClassCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.carriages.GeneralCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.carriages.PostCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.carriages.SleepingCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.train.Train;

class SortingAcsBySeatsTest {

	@Test
	void testSort() {
		GeneralCarriage carriage = new GeneralCarriage();
		EconomClassCarriage carriage2 = new EconomClassCarriage();
		SleepingCarriage carriage3 = new SleepingCarriage();
		PostCarriage carriage4 = new PostCarriage();
		
		Train train = new Train(4);
		train.addCarriage(carriage);
		train.addCarriage(carriage2);
		train.addCarriage(carriage3);
		train.addCarriage(carriage4);
		
				
		GeneralCarriage [] expexted = {carriage4, carriage3, carriage2, carriage};
		
		assertArrayEquals(expexted, train.performSorting(train));
	
	}

}
