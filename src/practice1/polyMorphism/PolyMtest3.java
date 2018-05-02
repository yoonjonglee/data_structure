package practice1.polyMorphism;

abstract class Calc2{
	int a;
	int b;
	
	abstract int result();
	
	void printResult() {
		System.out.println(result());
	}
	void setData (int m, int n) {
		a = m;
		b = n;
	}
}
class Plus extends Calc2{
	int result() {return a + b;}
}
class Minus extends Calc2{
	int result() {return a - b;}
}
public class PolyMtest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 87;
		int y = 45;
		
		Calc2 calctest1 = new Plus();
		Calc2 calctest2 = new Minus();
		
		calctest1.setData(x, y);
		calctest2.setData(x, y);
		System.out.println(x+" + "+y+" = ");
		calctest1.printResult();
		System.out.println(x+" - "+y+" = ");
		calctest2.printResult();

	}

}
