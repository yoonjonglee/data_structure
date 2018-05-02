/**
 * 
 */
package practice1.testofinterface;

/**
 * @author jinhyang
 *
 */

interface Cry{
	void cry();
}

class Cat implements Cry{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("meaw meaw meaw~~~");
	}
}

class Dog implements Cry{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("wal wal wal~~~");
	}
}

public class CheckCry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat  = new Cat();
		Dog dog  = new Dog();
		
		if(cat instanceof Cat) {
			cat.cry();
		} else if(dog instanceof Dog) {
			dog.cry();
		}

	}

}
