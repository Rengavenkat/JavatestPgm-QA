package Inhertance2;

public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C objc = new C();
		objc.displayData();
		objc.showData();
		objc.printData();
	}

}

class A {
	int a = 10;
	
	void printData() {
		
		System.out.println("Grand Parent Class ="+a);
		
	}
}

class B extends A {
	int b = 20;
	
	void showData() {
		System.out.println("Parent Class ="+b);
	
	}
}

class C extends B {
	int c = 30;
	
	void displayData() {
		System.out.println("Child Class ="+c);
	}
}