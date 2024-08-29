package Java_program;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		int van[] = new int[3];
		
		for(int i=0; i<van.length; i++) {
			  van[i] = s1.nextInt();
		}
		
		System.out.println(Arrays.toString(van));

	}

}
