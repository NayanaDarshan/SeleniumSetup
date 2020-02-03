package BasicWeb;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkConcept {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<String>();

		li.add("test");
		li.add("Qtp");
		li.add("selenium");
		li.add("RPM");
		li.add("RFT");

		// addfrist and addlst
		li.addFirst("Nayana");
		li.addLast("Darshan");

		// TO PRINT ALL THE ELEMENTS

		System.out.println("The contents of linked list is" + li);

		System.out.println(li.get(0));

		li.set(0, "Smira");

		System.out.println(li.get(0));

		li.removeFirst();
		li.removeLast();

		li.remove(1);
		System.out.println("The contents of linked list is" + li);

		// To print all the values of Linked List
		// For loop
		// Advance For loop
		// Iterator
		// While loop

		// for loop

		System.out.println("**************************************");

		for (int i = 0; i < li.size(); i++) {

			System.out.println(li.get(i));
		}
		for( String  str : li) {
			
			System.out.println(str);
		}

		
	Iterator <String>	ln = li.iterator();
	
	while(ln.hasNext()) {
		
		String str1   =  ln.next();
		
		System.out.println(str1);
	}
		
	System.out.println("*****************While Loop*****************8888");
	
	int num=0;
	
	while(num<li.size()) {
		
		System.out.println(li.get(num));
		num++;
	}
	}

}

