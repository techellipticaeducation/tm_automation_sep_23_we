package objects;

public class InheritanceDemo {
// parent -> variables and method -> child
	public static void main(String[] args) {
		H1 h1 = new H1();
		h1.test6();
		h1.test1();
		//System.out.println(h1.color);
		// Object Class
	}
	
	
}


	class H0{
		String color = "green";
		public void test6() {
			
		}
	}

	class H1 extends H0{
		String color = "red";
		int i = 10;
		public void test1() {
			
		}
	}

	class H2 extends H1{
		public void test2() {
			test1();
			System.out.println(i);
			test6();
			System.out.println(color);
		}
	}

	
	class H3 extends H1{
		public void test5() {
			test1();
			System.out.println(i);
			test6();
			System.out.println(color);
		}
	}

// HAS-A = object creation , new keyword
// IS-A = inheritance 