
public class A {
	
		 A(){//Default constructor---No args passed
			System.out.println("This is Class A default Constructor");
		
	}
		 
		 A(int a, int b){
			 System.out.println("a="+a);
			 System.out.println("This is Parameterized Constructor");
			 System.out.println(a);
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A(10,5); //Object is created. Constructor is called.
		System.out.println("The Main End");

	}

}
