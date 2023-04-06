import java.util.LinkedList;
import java.util.ListIterator;


public class linkedListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList<>();
		ll.add(10);
		ll.add("New");
		ll.add('c');
		
		System.out.println(ll);
		
		ll.add(0, 33);
		ll.addFirst("Start");
		ll.addLast("End");
		//Capturing current element and moving to next one
		ListIterator itr = ll.listIterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
			if(obj ==Character.valueOf('c')) {
				System.out.println("Next Index"+itr.nextIndex());
				System.out.println("Previous Index"+itr.previousIndex());
		
			}
		}
			
		System.out.println(ll.getLast());
		
		
		System.out.println(ll);

	}

}
