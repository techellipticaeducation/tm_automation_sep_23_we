package objects;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
//		int k1 = 5;
//		int k2 = 7;
//		double k = Calculator.add(k1/k2,30.5);
//		System.out.println(k);
		int k5 = 0;
		k5 = Calculator.sum(10);
		System.out.println(k5);
		k5 = Calculator.sum(10,20,30,50,34);
		System.out.println(k5);
		k5 = Calculator.sum(10,23,2,3,3,4,5,6,7,7,4,2,4,4,3,2);
		System.out.println(k5);
		k5 = Calculator.sum();
		System.out.println(k5);
		
	}
}


class Calculator{

	// When ever we have same method name,  
	//	but differnt type of param or different number of param
	// method overloading
	// Compile time polymorphism
	// method overloading doesnt impact on return type
	
	static int sum(int...i) {
		int s = 0;
		for(int j = 0 ; j < i.length ; j++) {
			s = s + i[j];
		}
		return s;
	}
	
	// var-args = various arguments
	
	
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
