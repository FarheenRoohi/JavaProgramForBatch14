package mapCollectionMar31;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreemapApr4 {

	public static void main(String[] args) {
		//homogenious keys are allowed
    TreeMap tm = new TreeMap<>();
    
    tm.put(2001,"Apple");
    tm.put(2002,"Doll");
    tm.put(2009,"Grapes");
    tm.put(2004, "Cat");
    tm.put(2006, "Ball");
    
    System.out.println(tm);
      // NavigableMap nm =  tm.descendingMap();
    NavigableMap<Integer ,Object> nm = tm.descendingMap();               tm.descendingMap();
    System.out.println(nm);
	}

}
