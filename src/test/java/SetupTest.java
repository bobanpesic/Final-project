
import static org.junit.Assert.*;

import org.junit.Test;

import src.main.java.CreateBerry;

public class SetupTest {

	@Test
	public void testBerryName() {
		assertEquals("cheri", CreateBerry.berryName(1));
	}

	@Test
	public void testTotalNumber() {
		assertEquals(64, CreateBerry.totalNumber());
	}

}
