
public class Minimumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,13,17,9,7};
		/*
		 * int maxno=a[0];
		 *  for(int i=0; i<a.length;i++)
		 *  { if(maxno<a[i]) { maxno=a[i]; }
		 * } System.out.println(maxno);
		 */
		
		int minno=a[0];
		for(int i=0; i<a.length;i++) {
			if(minno>a[i]) {
				minno=a[i];
			}
		}
		System.out.println(minno);
	}

}
