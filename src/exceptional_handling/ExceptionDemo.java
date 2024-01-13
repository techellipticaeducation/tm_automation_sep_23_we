package exceptional_handling;

import java.util.Scanner;

public class ExceptionDemo {
	// Exception Handling
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		
		System.out.println("Welcome to Square Calculator");
		while(true) {
			try {
				double retVal = getInput();
				System.out.println("Square : "+ retVal);
			}catch (Exception e) {
				System.out.println("Input entered by you is not valid. kindly provide double value");
			}finally {
				System.out.println("Lets go to next input now");
			}

		}
	}
	// Compile time exception
	// Checked Exception
	public static double getInput()throws Exception {
		System.out.println("Enter you value");
		String valStr = scan.next();
		double retVal = square(Double.parseDouble(valStr));
		return retVal;
	}

	public static double square(double args) {
		return args*args;
	}
}
