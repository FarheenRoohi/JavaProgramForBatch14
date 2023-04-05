package interfaceMar7;

public class InterfacePractice {

	public static void main(String[] args) {
         NewUser obj = new NewUser();
         obj.addUser();
         obj.deleteUser();
         obj.editUser();
	}

}

   interface User{
	   void addUser();
	   void deleteUser();
	   void editUser();
   }
   
   class NewUser implements User{

	@Override
	public void addUser() {
		System.out.println("This is a addUser Method");
	}

	@Override
	public void deleteUser() {
		System.out.println("This is a delete User Method");
	}

	@Override
	public void editUser() {
		System.out.println("This is a edit User Method");
	}
	   
   }