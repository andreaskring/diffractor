package dk.openforce.diffraction;

import java.util.Arrays;
import java.util.function.Function;

import dk.openforce.diffraction.exception.UnequalArrayLengthException;

/**
 * @author Andreas Kring <kring@openforce.dk>
 */
public class ArrayUtils {

	/**
	 * Add arrays of equal length
	 * 
	 * @param x
	 *            Arrays to add
	 * @return Sum of arrays @ throws UnequalArrayLengthException If the arrays
	 * to add are not the same length
	 */
	public static double[] add(double[]... x) throws UnequalArrayLengthException {
		checkArrayLengths(x);
		double[] sum = new double[x[0].length];
		for (int j = 0; j < x.length; j++) {
			for (int i = 0; i < sum.length; i++) {
				sum[i] += x[j][i];
			}
		}
		return sum;
	}
	
	public static double[] subtract(double[] x, double[] y) {
		checkArrayLengths(x, y);
		double[] diff = new double[x.length];
		for (int i = 0; i < x.length; i++) {
			diff[i] = x[i] - y[i];
		}
		return diff;
	}
	
	public static double[] multiply(double[]... x) throws UnequalArrayLengthException {
		checkArrayLengths(x);
		double[] product = Arrays.copyOf(x[0], x[0].length);
		for (int j = 1; j < x.length; j++) {
			for (int i = 0; i < x[0].length; i++) {
				product[i] *= x[j][i];
			}
		}
		return product;
	}

	/**
	 * Divide x with y
	 * @param x array of numerators
	 * @param y array of denominators (must all be different from zero)
	 * @return x/y
	 */
	public static double[] divide(double[] x, double[] y) {
		checkArrayLengths(x, y);
		double[] quotient = new double[x.length];
		for (int i = 0; i < x.length; i++) {
			quotient[i] = x[i] / y[i];
		}
		return quotient;
	}
	
	private static void checkArrayLengths(double[]... x) throws UnequalArrayLengthException {
		for (int i = 1; i < x.length; i++) {
			if (x[0].length != x[i].length) {
				throw new UnequalArrayLengthException("Arrays must be the same length");
			}
		}
	}
	
	// public static double[] function(double[] x, Function<Double, Double> f);

	public static void main(String[] args) {
		// ArrayUtils.add();

	}
}
