package Java_program;

public class Assignment_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
	    String output = "";
	    
	    for(int i = s.length(); i<0; i--) {
	    	char c1 = s.charAt(i);
	    	output = output+c1;
	    }
          if(output.equals(s)) {
        	  System.out.println("Palindrom");
          }
          else {
        	  System.out.println("Not a palindrome");
          }
	}

}
