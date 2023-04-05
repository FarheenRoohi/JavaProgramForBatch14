package ArraylistMar29;

import java.util.ArrayList;

public class DemaArrayList {

	public static void main(String[] args) {
		
		//creating another array list
		ArrayList al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		System.out.println("al1 =" +al1);
		
		
 ArrayList al = new ArrayList<>();
 al.add("Tom");
 al.add(100);
 al.add(10);
 al.add(10);
 al.add(20.80f);
 al.add('c');
 al.add(40);
 al.add(null);
 al.add("Tom");
 //al.add(10);
 //method arraylist
 al.add(1, "bob");
 al.addAll(al1);
 al.add(5, al1);
 
 System.out.println("al = " +al);
// al.clear();
 
 //System.out.println("al = " +al);
 //content method is give if element is avelable and falls if not
 System.out.println(al.contains("tom"));
 System.out.println(al.contains("Tom"));
 //compare two arraylist
 
 System.out.println(al.containsAll(al1));
 //get basic on index
 System.out.println(al.get(4));
 System.out.println(al.indexOf("bob"));
 System.out.println(al.indexOf("Tom"));
 System.out.println(al.lastIndexOf("Tom"));
 al.remove(1);//index
 al.remove(20.8f);//object
 System.out.println("al = " +al);
 
 al.remove(Integer.valueOf(10));// more then 1 integers
 
 System.out.println("al = " +al);
 al.removeAll(al1);
 System.out.println("al = " +al);
 al.set(1, "tom");//replace
 System.out.println("al = " +al);
 al.size();
 System.out.println(al.size());
 al.isEmpty();
 System.out.println(al.isEmpty());
 ArrayList al2 = new ArrayList<>();
 System.out.println(al1.isEmpty());
 System.out.println(al2.isEmpty());
 
	}

}
