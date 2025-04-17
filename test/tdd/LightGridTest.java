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

}
