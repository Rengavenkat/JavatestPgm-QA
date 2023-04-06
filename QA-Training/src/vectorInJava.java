import java.util.ArrayList;
import java.util.Vector;
import java.util.ArrayList;

public class vectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add(10);
		
		
		
		
		
		Vector v = new Vector<>();
		v.addElement(10);
		v.add(20);
		v.addElement("Renga");
		v.addElement(10);
		v.addElement(10.20f);
		v.addElement(10);
		v.addElement(null);
		v.addElement(true);
		
		for(Object obj:v) {
			System.out.println(obj);
		}
		
		for(int i =0; i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		v.addAll(3,al);
		
		v.add(2,"newadd");
		
		
		
		
		System.out.println(v);
	}

}
