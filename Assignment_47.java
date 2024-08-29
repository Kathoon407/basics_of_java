package Java_program;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[] = new int[5];
		Scanner s1 = new Scanner(System.in);
		for (int i =0; i<=5; i++) {
		try {
				count[i] = s1.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("handled");
		}
		}
         System.out.println(Arrays.toString(count));
	}

}

