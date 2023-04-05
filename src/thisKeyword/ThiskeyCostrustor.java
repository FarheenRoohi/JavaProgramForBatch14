package thisKeyword;

public class ThiskeyCostrustor {
	int a;
	int b;
	int c;
	ThiskeyCostrustor(){
		this(12);
		System.out.println("this is 0 args");
		
	}
	ThiskeyCostrustor(int a){
		this(15,50);
		System.out.println("this is 1 arg cons");
		}
		ThiskeyCostrustor(int a,int b){
			this(15,50,10);
			System.out.println("this is 2 args");
			}
	
		ThiskeyCostrustor(int a,int b ,int c){
			
			System.out.println("this is 3 args");
		}
	public static void main(String[] args) {
		ThiskeyCostrustor tk = new ThiskeyCostrustor();
		
			System.out.println("this is end");

	}

}
