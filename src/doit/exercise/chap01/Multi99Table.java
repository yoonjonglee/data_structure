package doit.exercise.chap01;

public class Multi99Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("곱셉표");
		for(int i=2; i<=9; i++) {
			System.out.print(i +" ");
			System.out.println();
			
			for(int j=1; j<=9; j++) {
				System.out.print(i*j +" ");
			}
			System.out.println();
		}

	}

}
