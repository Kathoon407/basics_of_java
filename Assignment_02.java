package Java_program;

public class Assignment_02 {
  public void add1() {
	  System.out.println("Non static method 1");
  }
  protected void add2() {
	  System.out.println("Non static method 2");
  }
  private void add3() {
	  System.out.println("Non static method 3");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_02 a1 = new Assignment_02();
		a1.add1();
		a1.add2();
		a1.add3();

	}

}
