package primitiveData;

public class Feb14InstanceVariable {
     static short sr = 48;
     //static variable
	static int a1 = 234;
	static byte b1;
	static boolean doll;
     
	public static void main(String[] args) {

		System.out.println(a1);
		System.out.println(b1);
		System.out.println(doll);
// default variable byte and boolean( if we not assign the value)
		//Memory allocated when object gets created.
		//Feb14InstanceVariable sr = new Feb14InstanceVariable();
		//className     objname = new Classname
		System.out.println(sr);
		
	}
   
}
