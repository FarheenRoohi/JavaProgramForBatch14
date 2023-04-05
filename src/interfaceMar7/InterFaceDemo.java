package interfaceMar7;

public class InterFaceDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.setData();
		obj.showData();
		obj.getData();

	}
}

interface A {
	int a = 10;// variable static,final

	void setData();// by default its a public abstract method so body not required.
	// public abstract void setData looks lie

	void showData();

	void getData();
}

class B implements A {

	@Override
	public void setData() {
		System.out.println("This is a interface setData Method");
	}

	@Override
	public void showData() {
		System.out.println("This is a interface showData Method");
	}

	@Override
	public void getData() {
		System.out.println("This is a interfsce getData method");
	}

}