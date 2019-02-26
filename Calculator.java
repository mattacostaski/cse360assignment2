/**
 * Name: Matthew Acosta
 * Class ID: 302
 * Description: The calculator class defines the calculator object,
 * which starts with a total value of zero, and its methods allow
 * a user to add, subtract, multiply, or divide the total by input
 * values. The getHistory() method returns the 
 */

package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * Constructor of the calculator class. Takes no parameters,
	 * and initializes the calculator's total to 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Method by which the current value of total is obtained
	 * 
	 * @return the current value of total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * adds a parameter value to the current value of total
	 * 
	 * @param value value to be summed with total
	 */
	public void add (int value) {
		total += value;
	}
	
	/**
	 * subtracts a parameter value from the current value of total
	 * 
	 * @param value value to be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * multiplies total with a parameter value
	 * 
	 * @param value value multiplied with total
	 */
	public void multiply (int value) {
		total *= value;
	}
	/**
	 * divides total by parameter value
	 * 
	 * @param value value by which total is divided
	 */
	public void divide (int value) {
		total /= value;
	}
	
	/**
	 * shows the operations of the calculator
	 * object on its total
	 * 
	 * @return	string of operations and values w/ updated total
	 */
	public String getHistory () {
		return "";
	}
}