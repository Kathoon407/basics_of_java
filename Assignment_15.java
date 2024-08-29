package Java_program;
import java.util.Scanner;
public class Assignment_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the gender");
		String Gender = s1.next();
		
		if(Gender == "Female") {
			System.out.println("Ticket is free");
		}
		else if (Gender == "Male"){
			System.out.println("Enter your age");
			int age = s1.nextInt();
			
			if(age <=12) {
				System.out.println("Half ticket price");
			}
			else {
				System.out.println("Full ticket");
			}
			
			
		}

	}

}
