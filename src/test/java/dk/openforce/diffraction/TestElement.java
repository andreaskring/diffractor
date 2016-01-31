package dk.openforce.diffraction;

import static org.junit.Assert.*;

import org.junit.Test;

/**
* @author Andreas Kring <kring@openforce.dk>
*/
public class TestElement {

	private Element H = Element.H;
	
	@Test
	public void shouldReturnAValues() {
		assertEquals(4, H.getA().length);
	}
	
	@Test
	public void shouldReturnBValues() {
		assertEquals(4, H.getB().length);
	}

	@Test
	public void shouldReturnCValue() {
		assertNotNull(H.getC());
	}
	
	@Test
	public void shouldReturnElementSymbol() {
		assertNotNull(H.getSymbol());
		assertNotEquals(0, H.getSymbol().length());
	}
	
}
