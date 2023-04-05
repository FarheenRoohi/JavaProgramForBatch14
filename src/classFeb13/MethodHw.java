package classFeb13;

public class MethodHw {

	public static void main(String[] args) {
		MethodHw mh = new MethodHw();
		short  result = mh.add(50,50);
		System.out.println("result=" +result);
		

	}
	
	 short add(int i,int j) {
		int c = i+j;
		return (short) c;
	}

}
