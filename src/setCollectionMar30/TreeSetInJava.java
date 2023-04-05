package setCollectionMar30;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
       TreeSet t = new TreeSet();
       
       //hetrogeneous object are not allowed
       
       t.add(10);
       t.add(20);
       t.add(40);
       t.add(50);
       t.add(6);
       //for decending order
       NavigableSet nav =     t.descendingSet();
       System.out.println(nav);
       System.out.println(t);
       SortedSet s = t.headSet(32);
       System.out.println(s);
       SortedSet s1 = t.tailSet(20);
       System.out.println(s1);
	}

}
