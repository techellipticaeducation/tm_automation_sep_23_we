package tm_automation_sep_23_we;

public class ConditionStatementDemo {
	public static void main(String[] args) {
		// If else , if elseif
		// less then 18 - Child
		// 19 to 30 = adult	
		//  31 - 45 = Mature
		// above 45 = old
		// 	Age Category Calculator
		
		int age = 28;
		if(age <= 18) {
			System.out.println("Person is Child");
		}else if(age > 18 && age <= 30) {
			System.out.println("Person is adult");
		}else if(age > 26 && age <= 45) {
			System.out.println("Person is mature");
		}else {
			System.out.println("Person is old");
		}

	}
}
