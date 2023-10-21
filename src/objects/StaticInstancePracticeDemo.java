package objects;

public class StaticInstancePracticeDemo {
	public static void main(String[] args) {
		System.out.println("D1.j => " + D1.j);
		D1 d1= new D1();
		d1.i = 20;
		
		D1 d2= new D1();
		
		System.out.println("d1.i => " + d1.i);
		d1.j = 50;
		System.out.println(d2.i);
		System.out.println(d2.j);
		
		D1 d3 = null;
		System.out.println(d3.j);
	}
}

// static variables
// instance variable

class D1{
	
	int i = j;
	int m = 10;
	static int j = 20;
}
