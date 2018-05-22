package practice1.examTest;

import java.util.Scanner;

public class TestScannerStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String keyString = "newyork city"; 
		
		System.out.println("put it your string");
		Scanner kb = new Scanner(System.in);
		
		//String varString = kb.next(); // space is not allowed
		String varString = kb.nextLine(); // every case is allowed until enter<-
		
		kb.close();
		
		if(varString.equalsIgnoreCase(keyString)) {
			System.out.println("correct");
		}else {
			System.out.println("wrong");
		}
		

	}

}
