package Java_program;
class parent{
	public static void value() {
		System.out.println("Inheritance");
	}
	public void value1() {
		System.out.println("Inheritance 2");
	}
}
public class Assignment_25 extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_25  a1 = new Assignment_25();
		a1.value1();
		value();
		

	}

}
