package objects;

public class ChatApplication {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "Rahul";
		h1.age = 28;
		h1.country  = "India";
		
		
		Human h2 = new Human();
		h2.name = "Anjali";
		h2.age = 25;
		System.out.println(h2.country);
		
		h2.country = "Australia";
		System.out.println(h2.country);
		System.out.println(h1.country);
		
//		final  makes your variable constant in term of value
//      static - makes your variable constant in terms of memory
		// actual constant final and static
		
//		System.out.println(h2.country);	
//		h1.speak("Hello");
//		h2.speak("Hey! Hello . How r you?");
//		h1.speak("Yeah I am good!");
//		h1.showInfo();
//		h2.showInfo();
//		h1.speak("Today is my Birthday");
//		h1.happyBirthDay();
//		h1.showInfo();
//		h2.happyBirthDay();
//		h2.showInfo();
//		h2.showInfo();
	}
}

class Human{	
	// variables - Characteristics
	String name;
	int age;
	static String country = "India";
	final static double PI = 3.14d;
	// Method - behavior
	
	public void speak(String content) {
		System.out.println(name + " : " + content);
	}
	
	public void happyBirthDay() {
		age++;
	}
	
	public void showInfo() {
		System.out.println("Name : " + name + ", age is " + age);
	}
	
}


