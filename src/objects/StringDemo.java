package objects;

public class StringDemo {
	public static void main(String[] args) {
		
		String s1 = "Pune";
		String s2 = "Pune";
		String s3 = new String("Pune");
		String s4 = new String("Pune");
		
		s3 = s3.intern();
		s4 = s4.intern();
		
		System.out.println(s1 == s2); // true
		System.out.println(s2 == s3); // false
		System.out.println(s3 == s4); // false
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s2.equals(s3));
//		System.out.println(s3.equals(s4));
		
		// String Method
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('u'));
		System.out.println(s1.replace("P", "K"));
		
		String rg = "hello this is vaibhav";
		String[]  ar = rg.split(" ");
		
		int i = 10;
		String iStr = String.valueOf(i);
		
		//"aaaabbbccc";
		// a4b3c3
		
		
	}
}

class Student{

	String studentName;
	String city;

}