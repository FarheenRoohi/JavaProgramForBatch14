package stringMAr17;

public class StringMethods {

	public static void main(String[] args) {
    
		//char string method
		String s = "I know My Name";
		System.out.println(s.charAt(5));
		//int length
		System.out.println(s.length());
		//string substring(intbegi
		System.out.println(s.substring(7));
		//string substring int begin index,int end index
		System.out.println(s.substring(1, 14));
		//boolean equals (charcsequence s)
		System.out.println(s.contains("know"));
		System.out.println(s.contentEquals("Know"));
		//boolean equals (object another)
		String s1 = "I know My Name";//true
		//           i know My Name";false
		System.out.println(s.contentEquals(s1));
		
		String s2 = "";
		String s3 = " Farheen";
		System.out.println(s2.isEmpty());
	    System.out.println(s.concat(s3));
	   
	   // Replace
	    String s4 = "ParVeen";
	    System.out.println(s3.replace("Farheen", "Parveen"));
	    //equalignoreCase
	    System.out.println(s4.equalsIgnoreCase(s3));
	//string split method
	   //String 
       String arrOfString[]=s.split(" ");
       for(int i=0;i<arrOfString.length;i++) {
    	   System.out.println(arrOfString[i]);
    	   
       }
     
    	   
       
	}

}
