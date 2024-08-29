package Java_program;

public class Assignment_55 {

	public static void name() {
		System.out.println("Method overloading static method");
	}
	public static void name(int a) {
		System.out.println("Method overloading passing the param");
	}
	public void sub() {
		System.out.println("Non static method overloading");
	}
	public void sub(int a, double b) {
		System.out.println("Non static methods");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			name();
			name(1);
			Assignment_04 n1 = new Assignment_04();
			n1.sub();
			n1.sub(1, 0.5);
			
	}

}
