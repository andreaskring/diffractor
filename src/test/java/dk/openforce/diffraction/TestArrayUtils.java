package dk.openforce.diffraction;

import static org.junit.Assert.*;

import org.junit.Test;

import dk.openforce.diffraction.exception.UnequalArrayLengthException;

/**
* @author Andreas Kring <kring@openforce.dk>
*/
public class TestArrayUtils {

	@Test(expected=UnequalArrayLengthException.class)
	public void shouldThrowExceptionIfArraysToAddAreNotTheSameLength() {
		ArrayUtils.add(new double[5], new double[7]);
	}

	@Test(expected=UnequalArrayLengthException.class)
	public void shouldThrowExceptionIfArraysToAddAreNotTheSameLength2() {
		ArrayUtils.add(new double[5], new double[5], new double[7]);
	}
	
	@Test(expected=UnequalArrayLengthException.class)
	public void shouldThrowExceptionIfArraysToAddAreNotTheSameLength3() {
		ArrayUtils.add(new double[5], new double[7], new double[5]);
	}
	
	@Test
	public void shouldAddTwoArraysCorrectly() {
		double[] a1 = {2.2, 3.3, 4.4};
		double[] a2 = {1.1, 2.2, 3.3};
		double[] a3 = {0.1, 0.2, 0.3};
		assertEquals(3.4, ArrayUtils.add(a1, a2, a3)[0], TestConstants.tolerance);
		assertEquals(5.7, ArrayUtils.add(a1, a2, a3)[1], TestConstants.tolerance);
		assertEquals(8.0, ArrayUtils.add(a1, a2, a3)[2], TestConstants.tolerance);
	}

	@Test(expected=UnequalArrayLengthException.class)
	public void shouldThrowExceptionIfArraysToSubtractAreNotTheSameLength() {
		ArrayUtils.subtract(new double[5], new double[7]);
	}
	
	@Test
	public void shouldSubtractTwoArraysCorrectly() {
		double[] a1 = {2.0, 31.0, 14.0};
		double[] a2 = {1.0, 12.0, 3.5};
		assertEquals(1.0, ArrayUtils.subtract(a1, a2)[0], TestConstants.tolerance);
		assertEquals(19.0, ArrayUtils.subtract(a1, a2)[1], TestConstants.tolerance);
		assertEquals(10.5, ArrayUtils.subtract(a1, a2)[2], TestConstants.tolerance);
	}
	
	@Test(expected=UnequalArrayLengthException.class)
	public void shouldThrowExceptionIfArraysToMultiplyAreNotTheSameLength() {
		ArrayUtils.multiply(new double[5], new double[7], new double[5]);
	}

	@Test
	public void shouldMultiplyThreeArraysCorrectly() {
		double[] a1 = {2.0, 3.0, 4.0};
		double[] a2 = {1.0, 2.0, 3.0};
		double[] a3 = {0.1, 0.2, 0.3};
		assertEquals(0.2, ArrayUtils.multiply(a1, a2, a3)[0], TestConstants.tolerance);
		assertEquals(1.2, ArrayUtils.multiply(a1, a2, a3)[1], TestConstants.tolerance);
		assertEquals(3.6, ArrayUtils.multiply(a1, a2, a3)[2], TestConstants.tolerance);
	}

	@Test(expected=UnequalArrayLengthException.class)
	public void shouldThrowExceptionIfArraysToDivideAreNotTheSameLength() {
		ArrayUtils.divide(new double[5], new double[7]);
	}
	
	@Test
	public void shouldDivideTwoArraysCorrectly() {
		double[] a1 = {3.0, 36.0, 14.0};
		double[] a2 = {2.0, 12.0, 4.0};
		assertEquals(1.5, ArrayUtils.divide(a1, a2)[0], TestConstants.tolerance);
		assertEquals(3.0, ArrayUtils.divide(a1, a2)[1], TestConstants.tolerance);
		assertEquals(3.5, ArrayUtils.divide(a1, a2)[2], TestConstants.tolerance);
	}

}
