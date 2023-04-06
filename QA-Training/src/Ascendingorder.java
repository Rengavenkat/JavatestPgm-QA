
public class Ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,11,12,13,8,6,5,9};
	
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp = 0;
				if(a[i]<=a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					//System.out.println(a[i]);
				}
			}
			System.out.println(a[i]);
		}
		
	}

}
