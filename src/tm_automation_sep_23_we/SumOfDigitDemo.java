package tm_automation_sep_23_we;

public class SumOfDigitDemo {
	public static void main(String[] args) {
		
		int input = 145;
		int sum = 0;
		
		while(input != 0) {
			int reminder = input % 10;
			sum = sum  + reminder;
			input = input  / 10;
		}
		
		System.out.println(sum);
		
	}
}
