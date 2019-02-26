/**
 * Name: Matthew Acosta
 * Class ID: 302
 * Description: The calculator class defines the calculator object,
 * which starts with a total value of zero. The seqLength
 * instance variable tracks the number of operations entered into the
 * calculator. The 2-Dimensional array, sequence, stores both the
 * value and operation used.
 * The classes methods allow a user to add, subtract,
 *  multiply, or divide the total by input values. 
 *  The getHistory() method allows the user to view the sequence
 *  of inputs and values inputed.
 */

package cse360assign2;

public class Calculator {

	private int total;
	private int seqLength;
	private int[][] sequence;
	
	/**
	 * Constructor of the calculator class. Takes no parameters,
	 * and initializes the calculator's total to 0
	 */
	public Calculator () {
		total = 0;  
		seqLength = 0;
		sequence = new int[2][100];
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
		sequence[0][seqLength] = 0;
		sequence[1][seqLength] = value;
		seqLength++;
	}
	
	/**
	 * subtracts a parameter value from the current value of total
	 * 
	 * @param value value to be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		sequence[0][seqLength] = 1;
		sequence[1][seqLength] = value;
		seqLength++;
	}
	
	/**
	 * multiplies total with a parameter value
	 * 
	 * @param value value multiplied with total
	 */
	public void multiply (int value) {
		total *= value;
		sequence[0][seqLength] = 2;
		sequence[1][seqLength] = value;
		seqLength++;
	}
	/**
	 * divides total by parameter value
	 * 
	 * @param value value by which total is divided
	 */
	public void divide (int value) {
		total /= value;
		sequence[0][seqLength] = 3;
		sequence[1][seqLength] = value;
		seqLength++;
	}
	
	/**
	 * shows the operations of the calculator
	 * object on its total
	 * 
	 * @return	string of operations and values w/ updated total
	 */
	public String getHistory () {
		String seq = "0 ";
		for(int i = 0; i < seqLength; i++){
			switch(sequence[0][i]){
				case 0:
					seq += "+ " + sequence[1][i] + " ";
					break;
				case 1:
					seq += "- " + sequence[1][i] + " ";
					break;
				case 2:
					seq += "* " + sequence[1][i] + " ";
					break;
				case 3:
					seq += "/ " + sequence[1][i] + " ";
					break;
				default:
					break;
			}
		}
		seq += "= " + total;
		return seq;
	}
}