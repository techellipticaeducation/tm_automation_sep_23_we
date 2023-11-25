package objects;

public class Exam1 {
	
	public static void test2() {
		// static -> non-static
		Exam1 exm1 = new Exam1();
		exm1.test1();
	}
		
	public void test1() {
		// static method from non-static method ?
		 test2();	
		 Exam1.test2();
	}
	
}
