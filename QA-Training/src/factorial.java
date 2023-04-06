
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int i=n;
		for(int j=1;j<i;++j) {
			n *= (i-j);
			//System.out.println(n);
			//System.out.println(j);
		
		}
		System.out.println(n);
		
	}

}
