package Java_program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
		h.add(9);
		h.add(91);
		h.add(89);
		h.add(8);
		
		
		Iterator k1 = h.iterator();
		while(k1.hasNext()) {
			System.out.println(k1.next());
		}
		
		

	}

}
