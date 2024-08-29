package Java_program;
class grantparent{
	public void value() {
		System.out.println("Grantparent");
	}
}
public class Assignment_28 extends grantparent {
     public void value() {
    	 super.value();
    	 System.out.println("value");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_28 a1 = new Assignment_28();
		a1.value();

	}

}
