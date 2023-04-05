package classFeb13;

public class StaticVariableFeb24 {
       int a =10;
       static int b = 12;
       
       void incriment() {
    	    a = a+1;
    	    b = b+1;
    	   System.out.println("a=" + a +", "+"b=" +b);
    	   
       }
	public static void main(String[] args) {

		StaticVariableFeb24 sv = new StaticVariableFeb24();
		sv.incriment();
		StaticVariableFeb24 sv1 = new StaticVariableFeb24();
		sv1.incriment();
		StaticVariableFeb24 sv2 = new StaticVariableFeb24();
		sv2.incriment();
		
		
		 
	}

}
