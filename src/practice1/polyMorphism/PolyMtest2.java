package practice1.polyMorphism;

public class PolyMtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 E eay = new J();
		J jay = new J();
		great(jay);
	}
	
	static void great(E e) {
		e.bye();
	}

}
class E {
	void bye() {
		System.out.println("good bye");
	}
}
class J extends E{
	void bye() {
		System.out.println("tchao");
	}
}