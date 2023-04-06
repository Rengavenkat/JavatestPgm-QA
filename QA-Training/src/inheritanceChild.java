
public class inheritanceChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objB = new B();
		objB.printData();
		objB.showData();
		System.out.println("Parent class ="+objB.a+"Child class ="+objB.b);
	}

}

class A	{
	int a = 20;
	
	void printData() {
		System.out.println("The vale of a--Parent class = "+a);
	}
}

class B extends A {
	int b = 30;
	
	void showData() {
		System.out.println("The value of B--Child Class = "+b);
	}
}