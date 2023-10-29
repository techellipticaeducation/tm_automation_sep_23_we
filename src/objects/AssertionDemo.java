package objects;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssertionDemo {

	@DataProvider(name= "amount")
	public static Object[][] getTestData(){
		// if amount <= 100 , then fee  = 10
		// if amount > 100 and <= 500 , then fee  = 5
		// if amount > 500 and < 1000 , then fee  = 2
		// else no fee
		
		
		Object[][] obj  = {{0,10},{1,11},{99,109},
				{100,110},{101,106},{499,504},{500,505},
				{501,503},{999,1001},{1000,1002},{1001,1001}};
		return obj;
	}
	
	@Test(dataProvider = "amount")
	public void calculateTotalAmountTestCase(int amount, int expected) {
		Interest interest = new Interest();
		int totalAmount = interest.calculateTotalAmount(amount);
		System.out.println(amount  + " -> expected - "+expected + " , Actual -" + totalAmount);
		Assert.assertEquals(totalAmount, expected , "Expected and actual not match");				
	}
	
}


class Interest{
	public int calculateTotalAmount(int inputAmount) {
		if(inputAmount <= 100) {
			return inputAmount+10;
		}else if(inputAmount > 100 && inputAmount <=500) {
			return inputAmount + 5;
		}else if(inputAmount > 500 && inputAmount <=1000) {
			return inputAmount + 2;
		}else {
			return inputAmount;
		}		
	}
	
}