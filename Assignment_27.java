package Java_program;
class value{
	value(){
		System.out.println("value 1");
	}
	value(int a){
		super();
		System.out.println("value 2");
	}
}
public class Assignment_27 extends value {
     Assignment_27(){
    	 super(9);
    	 System.out.println("value");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment_27();

	}

}
