/**
 * 
 */
package practice1.examFigure;

/**
 * @author jinhyang
 *
 */
public class SizeFigure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure fig1 = new Square(2.5);
		Figure fig2 = new Square(2.5, 3.9);
		Figure fig3 = new Circle(4.5);
		
		fig1.measure();
		fig2.measure();
		fig3.measure();

	}

}

class Square extends Figure {
	
	double side;
	double height;
	
	Square(double s){
		side = height = s;
	}
	
	Square(double s, double h){
		side = s;
		height = h;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("사각형 면적: " + (side * height));
	}

	@Override
	void around() {
		// TODO Auto-generated method stub
		System.out.println("사각형 둘레: " + 2*(side + height));
	}
	
}

class Circle extends Figure{
	
	final double pi = 3.14;
	double radius;
	
	Circle(double r){
		radius = r;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("원의면적: "+ (radius*radius*pi));
	}

	@Override
	void around() {
		// TODO Auto-generated method stub
		System.out.println("원의면적: "+ (radius*2*pi));
	}
	
}
