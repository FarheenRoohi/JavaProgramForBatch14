package tryCatchMar10;

import java.io.FileInputStream;

public class Demo2TryCatch {

	public static void main(String[] args) {
    System.out.println("start");
		int a=10;
		int b = 0;
		try {
			b = a/0;
		 
	//		File f = new File("c://data//data.txt");
		//  FileInputStream fs = new FileInputStream(f);
	//	}
	//	catch (FileNotFoundException fnfe) {
		//	fnfe.prinStackTrace();
		}
		
		catch (NullPointerException ne) {
			ne.printStackTrace();
			System.out.println("this is a NullPointer Exception"); 
		}
		catch (ArithmeticException ae) {
			b = a/1;
			//ae.printStackTrace();
			System.out.println("this is a Arithmetic Exception"+ae.getMessage());
		}
		catch (RuntimeException re) {
			System.out.println("This is RunTimeexception");
		
		}
		catch (Exception e) {
			System.out.println("this is a Exception");
		}
	 System.out.println("This is End");
	}
	}
