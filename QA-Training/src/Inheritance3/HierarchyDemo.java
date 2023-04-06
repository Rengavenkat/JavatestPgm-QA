package Inheritance3;

public class HierarchyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objb = new B();
		objb.showData();
		objb.printData();
		
		C objc = new C();
		objc.displayData();
		objc.printData();
		
		B1 objb1 = new B1();
		objb1.findData();
		objb1.showData();
		objb1.printData();
		//objb1.dispalyData();

	}

}


class A {
	int a = 10;
	
	void printData () {
		System.out.println("Parent Class A"+a);
	}
}

class B extends A {
	int b = 20;
	
	void showData() {
		System.out.println("Child class 1");
	}
}

class C extends A {
	int c = 30;
	
	void displayData() {
		System.out.println("Child class 2");
		
	}
}

class B1 extends B {
	int b1 = 40;
	
	void findData() {
		System.out.println("Child class of B1");
	}
}

