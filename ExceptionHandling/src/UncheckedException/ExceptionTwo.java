package UncheckedException;

public class ExceptionTwo {

	public static void main(String[] args) {
		int a= 10;
		
		try {
		System.out.println(a/0);
		}
		catch(ArithmeticException e) {
		//	System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		finally {
			System.out.println("no Exeption occurs !");
		}
 
	}

}
