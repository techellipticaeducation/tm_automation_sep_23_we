package collectiondemo;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set<Integer> nameArr = new LinkedHashSet<>();
	Scanner scan = new Scanner(System.in);
	while(true) {
		System.out.println("Enter Your Name : ");
		int name = scan.nextInt();
		nameArr.add(name);
		System.out.println("Total Students : " +nameArr.toString());
	}
	// Set - not Sequential, duplicate not allowed, 1 null allowed
	// Not index based
}
}
