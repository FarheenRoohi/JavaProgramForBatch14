package primitiveData;

public class Feb22Arraymax {

	public static void main(String[] args) {
		int a[]= {50, 40, 70, 20,50,70,100,120,150,10};
		int maxNumber = 0;
		for(int i=0; i < a.length; i++) {
			if(maxNumber<a[i]) {
				maxNumber=a[i];
			}
		}
		System.out.println(maxNumber);
		
		int minNumber = a[0];
		//System.out.println(minNumber);
		for(int i=0; i < a.length; i++) {
			if(minNumber > a[i]) {
				minNumber=a[i];
				//System.out.println("min value " + minNumber);
			}
		}
		System.out.println(minNumber);
	}

}
