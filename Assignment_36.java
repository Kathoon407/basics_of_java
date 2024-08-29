package Java_program;

public class Assignment_36 {
      static int is_alpha = 0;
      static int is_numeric = 0;
      static int is_space = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "kv no 1";
		char c1[] = input.toCharArray();
		
		for(int i=0; i<input.length(); i++) {
			boolean ans = Character.isAlphabetic(c1[i]);
			if(ans == true) {
				is_alpha++;
				
			}
			
		}
		    System.out.println(is_alpha);
		    
		    
		    for(int i=0; i<input.length(); i++) {
				boolean ans = Character.isDigit(c1[i]);
				if(ans == true) {
					is_numeric++;
					
				}
				
			}
			    System.out.println(is_numeric);

			    for(int i=0; i<input.length(); i++) {
					boolean ans = Character.isSpaceChar(c1[i]);
					if(ans == true) {
						is_space++;
						
					}
					
				}
				    System.out.println(is_space);


	}

}
