package by.itiu.dziad.lab11.poezd.model.logic.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.EconomClassCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.carriages.GeneralCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.carriages.SleepingCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.train.Train;

class Search2Test {

	@Test
	void testSearchCarriageOneZoneCost() {
		GeneralCarriage carriage = new GeneralCarriage();
		EconomClassCarriage carriage2 = new EconomClassCarriage();
		SleepingCarriage carriage3 = new SleepingCarriage();
		
		Train train = new Train(3);
		train.addCarriage(carriage);
		train.addCarriage(carriage2);
		train.addCarriage(carriage3);
		
		double min = 2.5;
		double max = 3.2;
		
		GeneralCarriage [] expected = {carriage3, null, null};
		
		assertArrayEquals(expected, Search.searchCarriageOneZoneCost(train, min, max));
	}

}
