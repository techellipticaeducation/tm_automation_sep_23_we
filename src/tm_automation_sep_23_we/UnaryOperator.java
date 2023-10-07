package tm_automation_sep_23_we;

public class UnaryOperator {
public static void main(String[] args) {
	// only need 1 operand
	// -
	// works with boolean !
	// increment operator
	// pre increment   - first increase then assign ++i
	// post increment  - first assign then increase i++
	
	int i = 10;
	int j = ++i + i++ + i++ + ++i + i++ + i++ + ++i;
	// short cut - when you find ++ add karo 
	// and u find varibale assign 
	System.out.println("j -> " + j);
	System.out.println("i -> " + i);
	
}
}
