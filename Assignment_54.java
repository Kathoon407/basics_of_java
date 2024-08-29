package Java_program;

public class Assignment_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1 = new StringBuffer("Kathoon");
		s1.append("Jannath Banu");
		System.out.println(s1);
		s1.insert(20, "m");
		System.out.println(s1);
		s1.replace(20, 28, "m");
		System.out.println(s1);
		System.out.println(s1.delete(20, 28));
		System.out.println(s1.reverse());
		System.out.println(s1.capacity());
		System.out.println(s1.charAt(6));
		System.out.println(s1.substring(8, 12));

	}

}
