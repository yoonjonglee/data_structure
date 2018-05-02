/**
 * 
 */
package practice1.testofabstract;

/**
 * @author jinhyang
 *
 */
public class Calculation2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plus Plus = new Plus();
		//Plus.setData(8, 9);
		Plus.setData(198822, 8736);
		Plus.answer();

	}

}
/*
abstract class Calc1 {
	int a;
	int b;
	
	abstract void answer();
	void setData(int m, int n) {
		a = m;
		b = n;
	}
}
*/
class Plus extends Calc1{
	void answer() {
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println("Plus class is overrided Calc1 class");
	}
	
	void test() {
		System.out.println("waka waki");
	}
}
