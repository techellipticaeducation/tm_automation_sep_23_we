package objects;

import org.testng.annotations.Test;

public class MethodDemo {
	
	
	@Test
	public void main() {
		int m1 = 10;
		int m2 = 2;
		
		int l = Calculator.multiply(10,20); // Arguments
		int k1 = Calculator.multiply(1,2);
		int k2 = Calculator.multiply(5,2);
		int k3 = Calculator.multiply(10,2);
		int k4 = Calculator.multiply(34,2);
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
		
		// reusability
	}
}

class Calculator{

	int m ;
	// input ,  int input1  int input2
	// return 
	
	// Array
	// after return keyword , you can't write anything
	
	
	// parameters
	static int multiply(int input1, int input2){
		int output = (int)(input1*input2);
		return output;
	}
	
	//  Non parameterized method
	int changeValueToDefault() {
		m = 0;
		return m;
	}
	
	// no return type
	void iAmNotReturningAnything() {
		System.out.println("hello");
	}
	

	// Pair Programming 
	// 1 - code-karna, 2 - logic 
	
}

