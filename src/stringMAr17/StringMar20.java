package stringMAr17;

public class StringMar20 {

	public static void main(String[] args) {
     String s = "Hello to Everyone to";
     String s1 = " i like chocolate";
     //int index(int char)
		System.out.println(s.indexOf('e'));
		//index of (int from index)
		System.out.println(s.indexOf('e', 3));
		System.out.println(s.indexOf('o', 5));
		//Charecter is available or not
		System.out.println(s.indexOf('a'));
		//int indexOf(String sub string int from index)
		
		System.out.println(s.indexOf("to"));
		System.out.println(s.indexOf("to", 7));
		System.out.println(s1.toUpperCase());
		System.out.println(s.toLowerCase());
        // checking space trim from left and right side
		String s2 = " i like  to  go for shoping  ";
		System.out.println(s2);
		System.out.println(s2.trim());
	}

}
