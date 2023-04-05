package polimorphism;

public class MethodOverridingmar3 {

	public static void main(String[] args) {
     Login  hdfc = new Login();
     hdfc.loginform();
     Newlogin sbi = new Newlogin();
     sbi.loginform();
	}
}
  class Login {
	  void loginform() {
		  System.out.println("user name="+"roohi");
          System.out.println("Password="+"123abdR");
          System.out.println("submit button");
		  
	  
	  }
	  }
  
  class Newlogin extends Login{
	  void loginform() {
         System.out.println("phone Number="+"213456");
		  
	  
	  }
  }

