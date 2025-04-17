package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LightGridTest {

	private LightGrid grid;
	@BeforeEach
	void setUp() throws Exception {
		grid = new LightGrid();
	}

	@Test
	void test() {
		assertEquals(grid.countLightsOn(), 0);
	}
	
	@Test
	void test2() {
		grid.turnOn(0,0,0,0);
		assertEquals(grid.countLightsOn(), 1);
	}

	@Test
	void test3() {
		grid.turnOn(0,0,999,999);
		assertEquals(grid.countLightsOn(), 1000000);
	}
	
	@Test
	void test4() {
		grid.turnOn(0,0,999,999);
		grid.turnOff(499, 499, 500, 500);
		assertEquals(grid.countLightsOn(), 999996);
	}

}
