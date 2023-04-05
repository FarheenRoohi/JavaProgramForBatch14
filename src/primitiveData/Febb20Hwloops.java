package primitiveData;

public class Febb20Hwloops {

	public static void main(String[] arg) {
		int i = 30;
		int count = 0;
		for(int a = 1; a<=13; a++) {
			if(i%a == 0) {
				count++;
				System.out.println(a + " ");
			}
		}
		
		if (count == 2) {
		System.out.println(i + "is prime numbber");
		} else {
			System.out.println( i + " is not a prime number");
		}
	
			
		}
		
	}

	
