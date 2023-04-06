package MethodOverloading;

public class OverlodingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverlodingDemo obj = new OverlodingDemo();
		int result = obj.add(10,30,40);
		System.out.println(result);
	}

int add (int a, int b) {
	return a+b;
}

float add (float a, int b) {
	return a+b;
}
int add(int a, int b, int c) {
	return a+b+c;
}

}