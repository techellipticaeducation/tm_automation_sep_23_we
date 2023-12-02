package objects;

public class BankDemoClass {
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();

		int amount = 1000;
		double finalAmount = amount + ((hdfc.interestRate()/100)*(amount));
		System.out.println(finalAmount);
		
	}
}
// Overriding is optional
// how to make it mandatory - abstract
// Abstarct class ke object nhi bante hai,  HAS A relation ship not allowed
// final - IS-A Realtionship not allowed
// abstarct and final together not allowed


abstract class Bank{
	public abstract double interestRate();
	public void test1() {
		
	}
}

class HDFC extends Bank{
	public double interestRate() {
		return 5.0d;
	}
}

class ICICI extends Bank{
	public double interestRate() {
		return 6.0d;
	}
}

class SBI extends Bank{
	public double interestRate() {
		return 7.0d;
	}
}
