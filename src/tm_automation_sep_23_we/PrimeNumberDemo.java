package tm_automation_sep_23_we;

public class PrimeNumberDemo {
	public static void main(String[] args) {

		int i = 25;

		boolean isPrime = true;
		if(i % 2 == 0) {
			isPrime = false;
		}else {
			for(int j = 3 ; j < i ; j=j+2) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(i + " is a prime number");
		}else {
			System.out.println(i + " is not a prime number");
		}

	}
}
