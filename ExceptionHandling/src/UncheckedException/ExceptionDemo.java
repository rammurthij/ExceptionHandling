package UncheckedException;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=20;
	//	System.out.println(a/0);   //Arithmetic Exception
		
		String s=null;;
	//	System.out.println(s.length());  //NullPointer Exception
		
		
//		String st="abcdef";
//		int i=Integer.parseInt(st);
//	//	System.out.println(i);         //NumberFormatException 

		int b[]=new int[3];
		b[0]=14;
		b[4]=11;
		System.out.println(b[4]);    //ArrayIndexOutOfBoundsException:
		
	}

}
