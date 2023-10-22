package objects;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		int k1 = 5;
		int k2 = 7;
		double k = Calculator.add(k1/k2,30.5);
		System.out.println(k);
		
	}
}


class Calculator{

	// When ever we have same method name,  
	//	but differnt type of param or different number of param
	// method overloading
	// Compile time polymorphism
	// method overloading doesnt impact on return type
	
	
	static int add(int i , int j){
		System.out.println("i am xyz");
		return i+j;
	}
	static int add(int i , int j, int k){
		System.out.println("i am rjk");
		return i+j+k;
	}

	static float add(float i, int j){
		System.out.println("i am abc");
		return i+j; 
	}

	static double add(float i, double j){
		System.out.println("i am mno");
		return i+j; 
	}
	
}
