package dk.openforce.diffraction;

import java.util.function.Function;

/**
 * @author Andreas Kring <kring@openforce.dk>
 */
public class ArrayFunctionDoubleToDouble implements ArrayUtil<double[], double> {

	@Override
	public double[] function(double[] e, Function<double, double> f) {
		for (int i = 0; i < e.length; i++) {
		 f.apply(e[0]);
		}
	}
}
