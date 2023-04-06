import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashSetinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add("tom");
		hs.add(20.93f);
		
		System.out.println(hs.add(10));
		hs.add(null);
		hs.add(30);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
		//for(Object obj:hs) {
			//System.out.println(obj);
		//}
		System.out.println(hs);
	}

}
