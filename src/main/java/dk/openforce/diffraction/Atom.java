/**
 * Interface for calculating atom specific quantities
 */

package dk.openforce.diffraction;

/**
* @author Andreas Kring <kring@openforce.dk>
*/
public interface Atom {
	
	/**
	 * Get the element 
	 * @return The element the corresponding atom
	 */
	public Element getElement();
	
	/**
	 * Calculates the atomic form factor as a function of Q
	 * @param Q Length of the Q vector 
	 * @return The value of the atomic form factor at the given Q-value
	 */
	public double atomicFormFactor(double Q) throws IllegalArgumentException;
	
	/**
	 * Calculates the atomic form factor as a function of Q
	 * @param Q An array of Q values 
	 * @return The values of the atomic form factor at the given Q-values
	 */
	public double[] atomicFormFactor(double[] Q);
}
