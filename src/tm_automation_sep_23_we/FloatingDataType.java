package tm_automation_sep_23_we;

public class FloatingDataType {
	public static void main(String[] args) {
		// float = 4 bytes
		// double = 8 bytes

		float f1 = 13.5f;
		double d1 = 34.5d;

		// true / false , 1 bit
		boolean bol = true; 
		
//		Character 
		// ASCII  and Unicode 
		// ASCII - keyboard  - 1 byte 
		
//		A - 65 - 1000001
		char c1 = 'a';
		int c1AsciiCode = (int )c1;
		
		int k = 117;
		char m1 = (char)k;
		System.out.println(m1);
		// all char (1 byte) are int but all int (4 byte) are not char
		// Unicode = 2 byte = 16bit = 2 power 16 = 63K
		
		char aaUnicode = '\u0C15';
		System.out.println(aaUnicode);
	}
}
