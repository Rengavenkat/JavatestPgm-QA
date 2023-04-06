import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class demoTreeSetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet tr = new TreeSet<>();
		tr.add(10);
		tr.add(10);
		//tr.add("Hi");
		//tr.add(null);
		//tr.add(10.2f);
		tr.add(30);
		tr.add(11);
		
		//NavigableSet nav = tr.descendingSet();
		//System.out.println(nav);
		//System.out.println(pollLast());
		//SortedSet s = tr.headSet(13);
		
		
		SortedSet s = tr.tailSet(11);
		
		System.out.println(s)	;
		

	}

}
