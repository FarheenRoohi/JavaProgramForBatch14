package finalKeyWordMar9;

public class FinalInJava {
       int a = 20;
	final int b = 50;
	
	//if we declare variable we can not change value
	//eg:-final int b = 40;
	public static void main(String[] args) {
	FinalInJava f = new FinalInJava();
	f.a = 30;
	System.out.println(f.b);
	System.out.println(f.a);
	E e =new E();
	e.display();
	}

}     // final method cant b override
      class Login{
    	  //final display(){}
    	    void display() {
    		  System.out.println("Login class display method");
    	  }
      }
      
      class NEwLogin extends Login{
    	  void display() {
    		  System.out.println("NewLogin class display method");
    	  }
    	  
      }
     // final  class C  {
      // eg :-final class can't extends class
    	  
    //  }
     // class D extends C{
   //   }
      //Is final method inhetited
     // Ans:- Yes
     // Eg:
      class F {
    	  int a =10;
    	final void show() {
    		System.out.println("a ="+a);
    	}
      }
      
      class E extends F{
    	  void display() {
    		show();  //we can access
    		System.out.println("This is a child class E");  
      }
      } 
      
      
      
      
      
      
      