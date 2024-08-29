package Java_program;
import java.util.Scanner;
public class Assignment_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s1.nextInt();
		
		if(age == 18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible");
		}
		

	}

}
