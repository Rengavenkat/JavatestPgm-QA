import java.util.ArrayList;
public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1 = new ArrayList<>();
		al1.add(30);
		al1.add("New List");
		
		System.out.println("al1=" + al1);
		
		ArrayList al = new ArrayList<>();
		al.add("Tom");
		al.add(10);
		al.add(20.30f);
		al.add(null);
		al.add(10);
		al.add(1,"Hi");
	
		
		
		System.out.println("al="+al);
		//al.addAll(al1);
		al.addAll(3, al1);
		//System.out.println(al.contains("Hello"));
		//System.out.println(al.containsAll(al1));
		//System.out.println(al.get(5));
		//System.out.println(al.indexOf(10));
		//System.out.println(al.lastIndexOf(10));
		
		System.out.println("al &al1="+al);
		//al.remove(Integer.valueOf(30));
		//al.remove(String.valueOf("New List"));
		al.removeAll(al1);
		System.out.println("al &al1="+al);
		
		//al.clear();
		System.out.println(al.size());
		al.set(2,"Welcome");
		
		System.out.println("Clear al"+al);
	}

}
