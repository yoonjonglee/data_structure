package practice1.examTest;

import java.util.Random;

public class TestBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int seq[] = {33, 14, 24, 31, 76};
		Random random = new Random();

		int seqLength = 20;
		int seq[] = new int[seqLength];
		for(int i=0; i<seqLength; i++) {
			seq[i]=random.nextInt(100);
		}
		
		
		for(int i=0; i < seq.length;  i++) {
			for(int j=0; j < seq.length-1; j++) {
				if(seq[j] > seq[j+1]) {
					int temp = seq[j];
					seq[j] = seq[j+1];
					seq[j+1] = temp;
				}
			}
		}
		for(int i=0; i<seq.length; i++) {
			System.out.println(seq[i]);
		}
		
		

	}

}
