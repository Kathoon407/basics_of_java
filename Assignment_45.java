package Java_program;

import java.util.Arrays;

public class Assignment_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int old[] = new int[3];
		old[0] = 9;
		old[1] = 8;
		old[2] = 19;
		
		int rev[] = new int[3];
		
		for(int i=0, k=2; i<old.length; i++ ) {
			rev[k] = old[i];
			k--;
		}
		System.out.println(Arrays.toString(rev));
		System.out.println(Arrays.toString(old));

	}

}
