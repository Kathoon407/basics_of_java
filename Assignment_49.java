package Java_program;

public class Assignment_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Kathoon";
		for(int i =0; i<=name.length(); i++) {
			try {
				char c = name.charAt(i);
				System.out.println(c);
			}
			catch(StringIndexOutOfBoundsException m1) {
				System.out.println("handled");
			}
		}

	}

}
