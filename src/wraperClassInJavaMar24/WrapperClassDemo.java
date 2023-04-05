package wraperClassInJavaMar24;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int a = 30;
        byte by = 10;
		Integer obj = new Integer(a);
		System.out.println(obj);
		Byte objB = new Byte(by);
		System.out.println(objB);
//convert object type into primitive
		int b = obj;
		System.out.println(b);

	}

}
