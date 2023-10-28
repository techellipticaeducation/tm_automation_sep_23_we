package objects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssertionDemo {

	@DataProvider(name= "amount")
	public static Object[][] getTestData(){
//		{0,1,99,100,101,499,500,501,999,1000,1001}
		Object[][] obj  = {{0},{1},{99},{100},{101},{499},{500},{501},{999},{1000},{1001}};
//		obj[0][0] =inputs;
		return obj;
	}
	
	@Test(dataProvider = "amount")
	public void calculateTotalAmountTestCase(int amount) {
		//int amount  = (Integer)amount1;
		Interest interest = new Interest();
		int totalAmount = interest.calculateTotalAmount(amount);
		System.out.println(totalAmount);	
	}
	
}


class Interest{
	
	// if amount <= 100 , then fee  = 10
	// if amount > 100 and <= 500 , then fee  = 5
	// if amount > 1000  then fee  = 0
	
	//  -- 
	
	public int calculateTotalAmount(int inputAmount) {
		if(inputAmount < 100) {
			return inputAmount+10;
		}else if(inputAmount > 100 && inputAmount <=500) {
			return inputAmount + 5;
		}else {
			return inputAmount;
		}		
	}
	
}