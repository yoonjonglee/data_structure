/**
 * 
 */
package practice1.testofabstract;

/**
 * @author jinhyang
 *
 */
public abstract class Animal {
	String name;
	abstract void cry();
	

}

class Cat extends Animal {
	void cry(){
		System.out.println("miaw");
	}
}
