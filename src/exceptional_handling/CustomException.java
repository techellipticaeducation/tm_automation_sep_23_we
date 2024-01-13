package exceptional_handling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your input price");
		int userinput = scan.nextInt();
		try {
			buyItem(10, userinput);
		}catch(PaymentNotSufficientException e) {
			e.printStackTrace();
		}finally {
    		// always execute 	
		}
	}
	
	public static void buyItem(int itemPrice, int myAmount) throws PaymentNotSufficientException {
		if(myAmount < itemPrice) {
			throw new PaymentNotSufficientException("Price is not sufficient");
		}
	}
}


class PaymentNotSufficientException extends Throwable{
	public PaymentNotSufficientException(String msg) {
		System.out.println(msg);
	}
}
