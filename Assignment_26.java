package Java_program;
class grant{
	public static void value() {
		System.out.println("Inheritance");
	}
	public void value1() {
		System.out.println("Inheritance 2");
	}
}
class parent1 extends grant{
	public void value2() {
		System.out.println("Inheritance 2");
	}
}
public class Assignment_26 extends parent1{
   public void value3() {
	   System.out.println("value");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_26 b = new Assignment_26();
		b.value1();
		b.value2();
		b.value3();
		value();

	}

}
