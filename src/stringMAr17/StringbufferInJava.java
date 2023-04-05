package stringMAr17;

public class StringbufferInJava {

	public static void main(String[] args) {
		String s = "roohi";//immutable class,synchronized method or object
		s.concat("Farheen");
		System.out.println("s="+s);
		//StringBuffer is mutable class,synchronized method/single thread perform
      StringBuffer sb = new StringBuffer("this is a sting buffer");
	 System.out.println(sb);
	 sb.append(" in java");
	 System.out.println(sb);
	 
	 //String builder non synchronized  perform multiple thread
	 
	   StringBuilder sbuilder = new StringBuilder("This is a string bulider");
	//string methods
	String s1  = "Maryam";
	String s2 = new String("Maryam");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	
	
	
	
	}

}
