package dk.openforce.diffraction;

import dk.openforce.diffraction.exception.IllegalElementException;

/**
* @author Andreas Kring <kring@openforce.dk>
*/
public class AtomImpl implements Atom {

	private Element element;
	
	public AtomImpl(Element element) throws IllegalElementException {
		if (element == null) {
			throw new IllegalElementException("Element cannot be null");
		}
		this.element = element;
	}
	
	public Element getElement() {
		return element;
	}

	/**
	 * Calculates the atomic form factor as a function of Q by 
	 * using Doyle & Turners approximation
	 */
	public double atomicFormFactor(double Q) throws IllegalArgumentException {
		
		if (Q < 0 || Q > 8*Math.PI) {
			throw new IllegalArgumentException("Q must be between 0 and 8*PI");
		}
		
		double sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += element.getA()[i]*Math.exp(element.getB()[i]*Math.pow(Q/(4*Math.PI), 2));
		}
		sum += element.getC();
		return sum;
	}

	public double[] atomicFormFactor(double[] Q) {
		// TODO Auto-generated method stub
		return null;
	}

}
