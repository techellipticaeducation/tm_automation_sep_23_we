package tm_automation_sep_23_we;

public class MonthFinderDemo {


	public static void main(String[] args) {

		// i will get input , and based on input 
		//		i need to check which month-num it is

		// January - 1,    Jan , JAN, January
		String monthName = "JAN";

		//		if(monthName.equals("Jan") || monthName.equals("January") || monthName.equals("Mar")) {
		//			System.out.println("1");
		//		}else if(monthName.equals("Feb") || monthName.equals("February")) {
		//			System.out.println("2");
		//		}else if(monthName.equals("Mar") || monthName.equals("March")) {
		//			System.out.println("3");
		//		}else if(monthName.equals("Apr") || monthName.equals("April")) {
		//			System.out.println("4");
		//		}else if(monthName.equals("May") || monthName.equals("May")) {
		//			System.out.println("5");
		//		}else if(monthName.equals("Jun") || monthName.equals("Jun")) {
		//			System.out.println("6");
		//		}else {
		//			System.out.println("provided input not found");
		//		}
		// Switch (only works with equality)
		// implementation : start executing when condition met
		// it will execute till end
		// Jump statement  
		
		switch(monthName) {
		case "Jan":
		case "JAN":
		case "January":
			System.out.println("1");
			break;	
		case "Feb":
		case "FEB":
		case "February":
			System.out.println("2");
			break;
		default:
			System.out.println("input not match");
		}


	}


}


