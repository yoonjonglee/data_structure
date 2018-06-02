package practice1.examTest;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int name[];
		name = new int[5];
		
		// above is same with
		int name2[] = new int[5];
		
		// and then, put members in like this,
		name2[0] = 4;
		name2[1] = 5;
		
		// or your should do like this
		for(int i=0; i<5; i++) {
			name2[i]= 7;
		}
		
		// and you can do with one line
		int oneArray[] = {3,4,6,9,18, 88};
		
		// why don't you to use while loop?
		int idx=0;
		while(idx<name2.length){
			name2[idx] = 9;
			idx++;
		}

	}

}
