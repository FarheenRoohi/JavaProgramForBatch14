package thisKeyword;

public class ThisKeyMar2 {
	int a;
	int b;
 void setData(int a ,int b){
	this.a = a;
	this.b = b;
	this.getdata();// or ThisKeyMar2 tk = new ThisKeyMar2();
	                  //tk.getdata();
//System.out.println(a+b);
 } void getdata() {
	 
	 System.out.println(a+b);
	
 }

	public static void main(String[] args) {
     System.out.println("print");
     ThisKeyMar2 tk = new  ThisKeyMar2();
     tk.setData(20,30);
     
	}

}
