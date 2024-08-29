package Java_program;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		double nam[] = new double[3];
		
		for(int i=0; i<nam.length; i++) {
			nam[i] = s1.nextInt();
		}
		
         System.out.println(Arrays.toString(nam));
	}

}
