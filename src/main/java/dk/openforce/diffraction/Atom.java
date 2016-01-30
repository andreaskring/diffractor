/**
 * Interface for calculating atom specific quantities
 */

package dk.openforce.diffraction;

public interface Atom {
	
	/**
	 * Get the element 
	 * @return The element the corresponding atom
	 */
	public Element getElement();
	
	/**
	 * Calculates the atomic form factor as a function of Q
	 * @param Q
	 * @return The value of the atomic form factor at the given Q-value
	 */
	public double atomicFormFactor(double Q);
}
