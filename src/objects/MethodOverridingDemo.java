package objects;

public class MethodOverridingDemo {
	
	public String getString() {
		String g1 = new String("asdfas");
		return g1;
	}
	
	public static void main(String[] args) {
		K2 k2 = new K2();
		k2.test1();
		
		
		//Access
		// public > protected > default 
		// you cannot reduce the visibility of method
		
		// Rules
		// private - override not possible
		
		// final class cannot be inherited - IS-A not allowed
		// final method cannot be overridden
		
		// return type 
	}
}


class K1{
	public String test1() {
		System.out.println("I am test1 method from K1");
		return null;
	}
}


class K2 extends K1{
	public String test1() {
		System.out.println("I am test1 method from K2");
		return null;
	}
}

// Object
// String 


