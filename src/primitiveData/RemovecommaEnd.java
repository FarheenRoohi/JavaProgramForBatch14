package primitiveData;

public class RemovecommaEnd {
	@SuppressWarnings("static-access")
	public static void fun (int x) {
		System.out.println(String.valueOf(x).join(", "));
	}
	public static void main(String[] args) {
		for(int d = 1; d <=20; d++) {
			int x = d * 2;
			fun(x);
		}		
	}
}
