package UncheckedException;

public class Ram {

	static int display() {
		System.out.println("Hellow");
		return 0;
	}
	void display1() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		display();
		Ram ram=new Ram();
		ram.display1();

	}

}
