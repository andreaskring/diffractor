package dk.openforce.diffraction;

import static org.junit.Assert.*;

import org.junit.Test;

import dk.openforce.diffraction.exception.IllegalElementException;

/**
* @author Andreas Kring <kring@openforce.dk>
*/
public class TestAtom {
	
	private Atom atomH = new AtomImpl(Element.H);
	private Atom atomAu = new AtomImpl(Element.Au);
	
	@Test
	public void shouldReturnElementH() {
		assertEquals(Element.H, atomH.getElement());
	}
	
	@Test
	public void shouldReturnElementAu() {
		Atom atom = new AtomImpl(Element.Au);
		assertEquals(Element.Au, atom.getElement());
	}
	
	@Test(expected=IllegalElementException.class)
	public void shouldThrowExceptionWhenElementNull() {
		Atom atom = new AtomImpl(null);
	}
	
	@Test
	public void shouldReturnCorrectFormFactorForElementHAndQ_2() {
		assertEquals(1.8899243237974557, atomH.atomicFormFactor(2.0), TestConstants.tolerance);
	}
	
	@Test
	public void shouldReturnCorrectFormFactorForElementHAndQ_3() {
		assertEquals(5.3701905015500282, atomH.atomicFormFactor(3.0), TestConstants.tolerance);
	}
	
	@Test
	public void shouldReturnCorrectFormFactorForElementAuAndQ_7() {
		assertEquals(470847.55336693, atomAu.atomicFormFactor(7.0), TestConstants.tolerance);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionIfQLessThan0() {
		atomAu.atomicFormFactor(-1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowExceptionIfQGreaterThan8Pi() {
		atomAu.atomicFormFactor(9*Math.PI);
	}

	@Test
	public void shouldReturnCorrectFormFactorsForAnArrayOfQValues() {
		// TO-DO: implement this test case
	}

}
