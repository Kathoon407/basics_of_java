package Java_program;

import java.util.Arrays;

public class Assignment_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "face";
		String nam = "cafe";
		
		if(name != nam) {
			System.out.println("Not anagran");
		}
		else {
			char c1[] = name.toCharArray();
			char c2[] = nam.toCharArray();
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
		}

	}

}
