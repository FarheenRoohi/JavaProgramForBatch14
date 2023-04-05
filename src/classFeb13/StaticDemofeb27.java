package classFeb13;

public class StaticDemofeb27 {
    
	public static void main(String[] args) {
		StaticDemofeb27 sd = new StaticDemofeb27();
		sd.display();
		//sttic method calling through class name.
		StaticDemofeb27.show();
		play();
          
	}
   void display() {
	   System.out.println("This is a display method");
   }
	 static void show() {
		 System.out.println("This is a show method");
	   }
	 static void play() {
		 System.out.println("This is play method");
	 }
	 
}
