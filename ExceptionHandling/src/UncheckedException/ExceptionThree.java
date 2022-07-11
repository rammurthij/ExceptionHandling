package UncheckedException;

public class ExceptionThree {

	public static void main(String[] args) {
		
		
		try {
			int a=10/2;
			System.out.println("exception in try block");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("exception handled in catch block");
		}finally {
			System.out.println("Iam Ram Murthi Jalukuri");
		}

	}

}
