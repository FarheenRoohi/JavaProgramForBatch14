package finalKeyWordMar9;

public class FinalKeyBlank {
     //blank final variable   
	final int a;
	final int b;
	{// should assign in instance block
	 a = 10;
	}
	//blank final constructor
	FinalKeyBlank(){
		b = 30;
	}
	
	// static final variable assign value through static block
	static final int c;
	static {
		c = 40;
	}
	//we can assign static value in constructor
	//FinalKeyBlank(int a){
		
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
