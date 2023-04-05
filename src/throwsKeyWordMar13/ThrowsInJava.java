package throwsKeyWordMar13;

public class ThrowsInJava {

	public static void main(String[] args)throws InterruptedException {
          ThrowsInJava t = new ThrowsInJava();
	        t.m();
          //either use try catch or throws interrupted to main mathod
   //  try {
	//t.readData();	
	}
	//catch(Exception e) {
		
	//}}
   
	void readData() throws InterruptedException {
		//either add try catch or throws
		//try {
			
	//	}
		//catch(Exception e) {
			
		//}
		System.out.println("this is readData method");
		
		
		
		Thread.sleep(2000);
	}
	void m() throws InterruptedException {
	readData();
	System.out.println("This is m method");
	}
}
