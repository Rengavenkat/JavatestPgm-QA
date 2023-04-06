
public class ThisVariable {
	int a;
	int b;
	
	void setData(int a,int b) {
		
		this.a = a;	
		this.b = b;
		//a=a;
		//b=b;
	
	}
	
	void getData() {
		setData(10,20);
		System.out.println("a ="+a+" b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisVariable t = new ThisVariable();
		t.setData(20,30);
		t.getData();
	}

}
