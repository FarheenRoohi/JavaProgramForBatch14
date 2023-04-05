package superKeyWordMarch8;

public class SuperKeyInConstructor {

	public static void main(String[] args) {
        N n = new N(10);
	}
	
}
    class M{
    	M(){
    		System.out.println("This is a parent 0 args constructor");
    	}
     
    M(int a){
    	System.out.println("This is a parent 1 args constructor");
    }
    M(int a,int b){
    	System.out.println("This is a parent 2 args constructor");
    }
    
    }
    class N extends M{
    	
    	N(int a){//default N constructor
    	//super(a);to call parent 1 args constructor
    	super(a,10);	//
    	System.out.println("This is the child class 1 arg constructor");
    	}
    	
    }