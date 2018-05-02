package practice1.polyMorphism;

public class PolyMtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A as = new A();
		B bs = new B();
		
		bs.a = 40;
		
	 	as =  bs; // this is correct
		//bs = as; // this is wrong. super class cannot be put in to sub class

	}

}

class A{
	int a = 10;
	void pest() {	
	}
}

class B extends A{
	int n = 20;
	void pest() {
		System.out.println("hello test");
	}
}