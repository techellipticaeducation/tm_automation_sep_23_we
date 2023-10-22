package objects;

public class ArrayDemo {
	public static void main(String[] args) {

		// array are datatype - where you can store collection of data
		// dimention in array , 2D Array - Excel Sheet
		
		//  array object -
		// array works with indexing 
		// array index starts from 0
		
		// upperbound
		int[]  ar1 = {40,40,50,67,89};
//		System.out.println(ar1[8]);
		// length = 5
		// upper bound will always 1 down then length
		
//		for(int i = 0 ; i <= ar1.length ;i++) {
//			System.out.println(ar1[i]);
//		}
		// 2D , array inside array
		// 3D , array inside array inside array
		// 60D allows
		
		int[][] allStudentData = {
				{40,40,50,67,89},  // 0
				{40,80,20},  // 1
				{40,10,80,37,89},  // 2
				{40,43,89,12,19}   // 3
		};
		System.out.println(allStudentData[0][3]);
		
		
		int[] hj = new int[5]; // 4 byte * 5 = 20 byte
		
//		Database , 10, 20, 30, 40
		
		
		
		hj[0] = 10;
		hj[1] = 20;
		hj[2] = 20;
		hj[3] = 40;
		hj[4] = 78;
		
		// array - rule - when we are defining array. we have to provide size to that. 
		// array never dynamic
		
		//  Ofc 
		//	100 seats

//		dev - 1
// QA - 2
		// Devops = 3
		// Devops = 4
		
		
		
		
	}
}
