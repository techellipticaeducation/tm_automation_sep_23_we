package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentNameCollectionDemo {
public static void main(String[] args) {
	
	// index based
	
//	List<Object> nameArr = new ArrayList<>();
//	Scanner scan = new Scanner(System.in);
//	while(true) {
//		System.out.println("Enter Your Name : ");
//		String name = scan.next();
//		nameArr.add(name);
//		System.out.println("Total Students : " +nameArr.toString());
//	}
	
	Set<Integer> iList = new HashSet<Integer>();
	iList.add(10);  // 0
	iList.add(40);  // 1
	iList.add(30);  // 2
	iList.add(60);  // 3
	iList.add(70);  // 4

for(int i : iList) {
	System.out.println(i);
}
	
	
	
	
	// List - Sequential, duplicate allowed, null allowed
	// no default method for sort 
	// 1,5,4,2
	// 1,2,4,5
}
}
