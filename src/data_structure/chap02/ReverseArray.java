package data_structure.chap02;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.printf("length of array: ");
		int length_arr = kb.nextInt();
		int[] arr = new int[length_arr];
		
		for(int i=0; i<length_arr; i++) {
			System.out.printf("arr["+ i +"]= ");
			arr[i] = kb.nextInt();
		}
		
		kb.close();
		
		System.out.println();		
		System.out.println("reverse is processing...");
		System.out.println();		
		reverse(arr);
		
		for(int j=0; j<arr.length; j++) {
			System.out.println("arr["+ j +"]= " + arr[j]);
		}
		
		System.out.println();
		System.out.println("reverse is done");

	}
	
	static void reverse(int[] arr) {		
		for(int i=0; i<(arr.length/2); i++) {
			System.out.println("arr["+ i +"]"+ " and "
		    + "arr["+ (arr.length-i-1) +"] are crossed.");
			
			swap(arr, i, arr.length-i-1);
		}
	}
	
	static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

}
