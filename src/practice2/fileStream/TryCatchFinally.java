package practice2.fileStream;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			back(args[0]);
		}catch(Exception e){
			System.out.println("no parameters");
		}finally {
			System.out.println("function ends");
		}

	}
	
	static void back(String a) throws Exception {
		System.out.println(a);
	}

}
