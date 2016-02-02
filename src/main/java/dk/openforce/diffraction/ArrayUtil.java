package dk.openforce.diffraction;

import java.util.function.Function;

/**
* @author Andreas Kring <kring@openforce.dk>
*/
public interface ArrayUtil<E, F> {

	public F function(E e, Function<F, F> f);
}
