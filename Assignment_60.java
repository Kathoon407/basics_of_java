package Java_program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l =new LinkedList();
		l.add("apple");
		l.add("orange");
		l.add("neem");
		
		Iterator k1 = l.iterator();
		while(k1.hasNext()) {
			System.out.println(k1.next());
		}
		
		ListIterator l1 =l.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
	    while(l1.hasPrevious()) {
	    	System.out.println(l1.previous());
	    }


	}

}
