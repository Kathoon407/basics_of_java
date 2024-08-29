package Java_program;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vector v1 = 	new Vector();
	v1.add("a");
	v1.add("b");
	v1.add("c");
	v1.add("d");
	v1.add("e");
	v1.add("f");
	
	Enumeration e = v1.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	Iterator m = v1.iterator();
	while(m.hasNext()) {
		System.out.println(m.next());
	}
	
	ListIterator l = v1.listIterator();
	while(l.hasPrevious()) {
		System.out.println(l.previous());
	}
	

	}

}
