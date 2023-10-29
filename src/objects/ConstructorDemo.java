package objects;

public class ConstructorDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println(emp1.name);
		System.out.println(emp1.id);
		System.out.println(emp1);
	// Employee emp2 = new Employee("Rohit",1012);
		
		// 
		int[][]  coins = new int[7][2];
		coins[0][0] = 1;coins[0][1] = 0;
		coins[1][0] = 2;coins[1][1] = 0;
		coins[2][0] = 5;coins[2][1] = 0;
		
		
	}
}

class Employee{
	String name;
	int id;

	Employee(){
		this("vaibhav",3456);
	}
	// whenever you have to use instance level entity, this
	Employee(String name ,int id) {
		System.out.println("I am parameterised");
		this.name = name;
		this.id = id;
	}
	 void test1(){
		
	}
}
