/**
 * 
 */
package data_structure.chap5.sec3;

/**
 * @author jinhyang
 *
 */
public class Ex5_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		float a[] = new float[] {4, 3, 5, 0};
		float b[] = new float[] {3, 1, 0, 2, 1};
		
		// test
		//System.out.println("a array size: " + a.length);
		//System.out.println("b array size: " + b.length);
		
		//Polynomial A = new Polynomial(3, a);
		//Polynomial B = new Polynomial(4, b);
		Polynomial A = new Polynomial(a.length-1, a);
		Polynomial B = new Polynomial(b.length-1, b);
		
		OperatePoly optPoly = new OperatePoly();
		
		Polynomial C = optPoly.addPoly(A, B);
		
		System.out.printf("A(x)=");
		A.printPoly();
		System.out.printf("B(x)=");
		B.printPoly();
		System.out.printf("C(x)=");
		C.printPoly();
	}
}

class OperatePoly{
	private int degree_A = 0, degree_B = 0, degree_C = 0,
			index_A = 0, index_B = 0, index_C = 0;
	
	private int expo_A = 0, expo_B = 0;
	private float coef_A = 0, coef_B = 0, coef_C = 0;
	
	public Polynomial addPoly(Polynomial A, Polynomial B) {
		
		degree_A = A.getDegree();
		degree_B = B.getDegree();
		expo_A = degree_A;
		expo_B = degree_B;
		if(degree_A >= degree_B) {
			degree_C = degree_A;
		}else {
			degree_C = degree_B;
		}
		Polynomial C = new Polynomial(degree_C);
		while(index_A <= degree_A && index_B <= degree_B) {
			if(expo_A > expo_B) {
				C.setCoef(index_C++, A.getCoef(index_A++));
				expo_A--;
			}else if(expo_A == expo_B){
				C.setCoef(index_C++, A.getCoef(index_A++)+B.getCoef(index_B++));
				expo_A--;
				expo_B--;
			}else {
				C.setCoef(index_C++, B.getCoef(index_B++));
				expo_B--;	
			}
		}

		return C;
		
	}
	
}

class Polynomial {
	private int degree;
	private float coef[] = new float[20];
	
	Polynomial (int degree, float coef[]) {
		this.degree = degree;
		this.coef = coef;
	}
	
	Polynomial (int degree) {
		this.degree = degree;
		for(int i=0; i<=degree; i++) {
			this.coef[i] = 0;
		}
	}
	
	public int getDegree() {
		return this.degree;
	}
	
	public float getCoef(int i) {
		return this.coef[i];
	}
	
	public float setCoef(int i, float coef) {
		return this.coef[i] = coef;
	}
	
	public void printPoly() {
		int temp = this.degree;
		for(int i=0; i<=this.degree; i++) {
			System.out.printf("%3.0fx^%d", this.coef[i], temp--);
		}
		
	}
}
