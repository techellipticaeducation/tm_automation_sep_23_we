package tm_automation_sep_23_we;

import java.util.Scanner;

public class OddEvenProgram {
	public static void main(String[] args) {

		// Take input from user, and check whether number is odd or even

		//	12 - even
		// 11  - odd
		
		// Conditional Operator 
		// > < >= <= == !-
		int k1 = 10;
		int k2 = 10;
//		System.out.println(k1 == k2); // true
//		System.out.println(k1 != k2); // false
//		System.out.println(k1 > k2); // false
//		System.out.println(k1 < k2); // false
//		System.out.println(k1 >= k2); // true
//		System.out.println(k1 <= k2); // true
		
		// Bitwise
		//& |
		// AND & (both are true then condition is true)
		// true & true   = true
		// true & false = false
		// false & true = false
		// false & false = false
		
		//  OR (if anyone is true then i am true)
		// true | true   = true
		// true | false = true
		// false | true = true
		// false | false = false
		
		
//		H1   &   H2
// 		true    true = true
		
//		Logical Operator , && ||
		
//		System.out.println("Enter Your Number :");
//		Scanner hj = new Scanner(System.in);
//		int i = hj.nextInt();
//		if(i%2 == 0) {
//			System.out.println(i + " is Even");
//		}else {
//			System.out.println(i + " is Odd");
//		}
		
		System.out.println(True() || False());
		
	}
	
	public static boolean True() {
		System.out.println("i am in true  block");
		return true;
	}
	
	public static boolean False() {
		System.out.println("i am in false  block");
		return false;
	}
	
}
