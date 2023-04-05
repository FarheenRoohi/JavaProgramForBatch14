package interfaceMar7;

public class Interface {

	public static void main(String[] args) {
       Pencil   p  = new Pencil();
       p.first();
       p.second();
	}

}
interface Book{
	void first();
}
interface Pen extends Book{
	void second();
}
class Pencil implements Pen{

	@Override
	public void first() {
		System.out.println("This is first metho");
	}

	@Override
	public void second() {
		System.out.println("This is a second Method");
	}
	
}