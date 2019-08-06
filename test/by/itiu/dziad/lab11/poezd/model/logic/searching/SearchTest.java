package by.itiu.dziad.lab11.poezd.model.logic.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import by.itiu.dziad.lab11.poezd.model.entity.carriages.EconomClassCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.carriages.GeneralCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.carriages.SleepingCarriage;
import by.itiu.dziad.lab11.poezd.model.entity.train.Train;

class SearchTest {

	@Test
	void testSearchCarriageSeatsNumber() {
		GeneralCarriage carriage = new GeneralCarriage();
		EconomClassCarriage carriage2 = new EconomClassCarriage();
		SleepingCarriage carriage3 = new SleepingCarriage();
		
		Train train = new Train(3);
		train.addCarriage(carriage);
		train.addCarriage(carriage2);
		train.addCarriage(carriage3);
		
		int min = 0;
		int max = 20;
		
		GeneralCarriage [] expected = {carriage3, null, null};
		
		assertArrayEquals(expected, Search.searchCarriageSeatsNumber(train, min, max));
	}

}
