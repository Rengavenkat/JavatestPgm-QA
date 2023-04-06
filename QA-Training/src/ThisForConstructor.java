
public class ThisForConstructor {
	
	ThisForConstructor(){
		this(10);
		System.out.println("This is 0 Arg COnstructor");
	}
	
	ThisForConstructor(int a){
		this(10,20
				);
		
		System.out.println("This is 1 Arg COnstructor");
	}
	
	ThisForConstructor(int a,int b){
		this(20,30,40);
		System.out.println("This is 2 Arg COnstructor");
	}
	
	ThisForConstructor(int a, int b, int c){
		System.out.println("This is 3 Arg COnstructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
