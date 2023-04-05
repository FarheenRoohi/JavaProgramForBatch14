package StringConstructorMar20;

public class StringHw {

	public static void main(String[] args) {
     String s = "this is java class";
     for(int i= s.length()-1;i>=0;i--)
     {
    	 System.out.print(s.charAt(i));
	}  
     String s2 = "daily";
     String s1 = "practice";
     System.out.println(s2.concat(s1));
     System.out.println(s2+s1);
     //palindrome mans eg level,radar
	String s3 ="level";
	String rev = "level";
	for(int i=s3.length()-1;i>=0;i--) {
		
	
	System.out.println(s3);
	}
	String s4 = "Nubaid Rahman Mohammad";
	String arr[]= {"Nubaid","Rahman","Mohammad"};
	System.out.println(arr[2]+ " "+ arr[0]);
	System.out.println(s4);
	}
}
