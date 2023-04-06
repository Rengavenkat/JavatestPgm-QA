import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> hm = new HashMap<>();
		hm.put(1001, "Renga");
		hm.put(1005, "Nayaki");
		hm.put(1003, 100);
		hm.put(1004, null);
		//hm.put(null, 'c');
		
		System.out.println(hm.get(1003));
		
		//Reading key value pair entrySet
//		for(Entry<Object, Object> eachEntry:hm.entrySet()) {
	//		System.out.println(eachEntry.getKey()+"-001"+eachEntry.getValue());
		//}
		
		//keySet and valueSet
		
//		for(Object eachKey: hm.keySet()) {
	//		System.out.println("Key ="+eachKey+"Value =" +hm.get(eachKey));
		//}
		
		//get values only
		
	//	for(Object eachValue:hm.values()) {
		//	System.out.println("Value only ="+eachValue);
		//}
		
		Iterator<Map.Entry<Object, Object>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Object, Object> eachEntry = itr.next();
			System.out.println(eachEntry.getKey()+ " "+ eachEntry.getValue());
		}
		//hm.remove(1004);
		//hm.remove(1003,hm);
		//hm.replace(1003, "Chitra");
		//hm.replace(1001, "Renga","Chitra");
		
		System.out.println(hm);

	}

}
