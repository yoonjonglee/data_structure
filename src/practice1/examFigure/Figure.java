/**
 * 
 */
package practice1.examFigure;

/**
 * @author jinhyang
 *
 */
public abstract class Figure {
	
	abstract void area();
	abstract void around();
	
	void measure() {
		area();
		around();
		System.out.println();
	}
}


