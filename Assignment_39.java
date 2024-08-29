package Java_program;

public class Assignment_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[3];
		num[0] = 10;
		num[1] = 16;
		num[2] =19;
		
		int given_number = 19;
		
		for(int i=0; i<num.length; i++) {
			given_number = num[i];
		
		
		if(given_number == num[i]) {
			System.out.println("present");
		}
		else {
			System.out.println("Not present");
		}
		}

	}
		

}
