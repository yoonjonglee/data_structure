package practice1.examTest;

import java.util.Scanner;

public class TestScannerSystemIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);		
		System.out.println("put in number of limit size of numbers");
		int size_num = keyboard.nextInt();
		int array[] = new int[size_num];
		
		for(int i=0; i<size_num; i++) {
			System.out.println("put in int number of member");
			array[i] = keyboard.nextInt();
			System.out.println(array[i]);
		}
		System.out.println("OK it is done");
		
		keyboard.close();

	}

}
