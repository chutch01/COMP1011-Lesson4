/**
 * 
 */

/**
 * @author Cody Hutchinson
 *
 */
import javax.swing.JOptionPane;


public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String firstNumber = "";
		String secondNumber = "";
		
		//obtain user input

		try{	
			firstNumber = JOptionPane.showInputDialog("Enter first Integer");
			System.out.println(firstNumber);
			secondNumber = JOptionPane.showInputDialog("Enter second Integer");
			System.out.println(secondNumber);
			
			int number1 = Integer.parseInt(firstNumber);
			int number2 = Integer.parseInt(secondNumber);
			
			int sum = number1 + number2;
			
			//JOptionPane.showMessageDialog(null, "The sum is" + sum + "The sum of two integers",);
			JOptionPane.showMessageDialog(null, "The Sum is " + sum, "The Sum of two integers", JOptionPane.PLAIN_MESSAGE);
		}
		 catch(Exception e){
			 JOptionPane.showMessageDialog(null, "Incorrect values entered" ,"Entry Error", JOptionPane.ERROR_MESSAGE);
			 System.out.println("incorrect values entered");
			 System.out.println(e);
		 }

	
	}
}
