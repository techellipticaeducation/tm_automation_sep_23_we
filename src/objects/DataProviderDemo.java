package objects;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	// TestNG - 90% 
	
	@DataProvider(name="squarevalue")
	public static Object[][] data1() {
		Object[][] h1 = 
			{
					{10,20,30},
					{20,50,70},
					{4,2,6},
					{6,7,13},
					{-1,-1,-2},
			};
		return h1;
	}
	
	@Test(dataProvider = "squarevalue")
	void add(int i, int j, int expected) {
		Assert.assertEquals(i+j, expected);
		// Ctrl + /
//		if(i+j == expected) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
//		}
	}
	
}
