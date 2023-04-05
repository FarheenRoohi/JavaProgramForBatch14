package finallyBlockMar13;

public class FinallyDemo {

	public static void main(String[] args) {
           int a = 20;
           int b = 0;
           System.out.println("this is start");
          try {
        	  b = a/0;
        	  System.out.println("this is try block");
   
          }
         // catch (Exception e) {
        	//  b = a/1;
        	//  System.out.println("this is a catch block");
      	     // e.printStackTrace();
      	    //  System.out.println("got Exception"+ e.getMessage());
          //}
          finally {
        	  System.out.println("This is a finally block");
          }
	}

}
