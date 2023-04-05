package stringProgramMar14;

public class StringliteralInJaca {

	public static void main(String[] args) {
		//String literal
		String s = "RooHi";
		String s1 = "Roohi";
		String s2 = "Roohi";
		System.out.println("S =" + s + " ," + "S1 =" + s1 + " , " + "S2 =" + s2);
		s2 = s2 + " Farheen";
		System.out.println("S =" + s + " ," + "S1 =" + s1 + " ," + "S2 =" + s2);
		s1.concat("Khan");
		System.out.println(s1);
		String s4 = s1.concat("khan");
		System.out.println(s4);
		System.out.println(s4 + " ,  " + s1.concat("Khan"));
		//String object
	
		String s5 = new String("parveen");
		String s6 = new String("parveen");
		System.out.println(s5==s6);
		
		System.out.println(s1.equalsIgnoreCase(s));
		System.out.println(s1==s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}