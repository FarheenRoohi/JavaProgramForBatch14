package interfaceMar7;

public class InterfaceHw {

	public static void main(String[] args) {

		Bmw bmw = new Bmw();
		bmw.addUser();
		bmw.deleteUser();
		bmw.editUser();
		bmw.display();
		bmw.show();
	}

}

interface Car {

	void addUser();

	void deleteUser();

	void editUser();
}

interface Honda  {
	void display();

	void show();
}

class Bmw implements Honda,Car {

	@Override
	public void addUser() {
		System.out.println("This is a addUser Method");
	}

	@Override
	public void deleteUser() {
		System.out.println("This is a delete Method");
	}

	@Override
	public void editUser() {
		System.out.println("This is a editUser Method");
	}

	@Override
	public void display() {
		System.out.println("This is a display Method");
	}

	@Override
	public void show() {
		System.out.println("This is a show Method");
	}

}