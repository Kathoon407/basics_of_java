package Java_program;

import java.util.Arrays;

public class Assignment_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int var[] = new int[3];
      var[0] = 9;
      var[1] =10;
      var[2] = 11;
      
      int var1[] = new int[3];
      
      for(int i=0; i<var.length; i++) {
    	   var1[i] = var[i];
      }
      System.out.println(Arrays.toString(var1));
      System.out.println(Arrays.toString(var));
	}
	
	   

}
