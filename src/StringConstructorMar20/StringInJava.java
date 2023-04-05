package StringConstructorMar20;

public class StringInJava {

	public static void main(String[] args) {
          String s = new String();
          String s1 = new String("Farheen");
          System.out.println(s1);
          StringBuffer sb = new StringBuffer("roohi");
         // assigning the stringbuffervalue to string 
          String s2 = new String(sb);
          System.out.println(s2);
	}

}
