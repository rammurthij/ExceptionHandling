package UncheckedException;

public class ExceptionOne {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		String a=null;
		try {
		System.out.println(a.length());
		}
		catch(NullPointerException e) {
			//System.out.println(e);
			//e.printStackTrace();
			System.out.println(e.toString());
		}    
		finally {
		System.out.println("Program in Progress.....");
		System.out.println("Program in Completed !!");
		}
	}

}
