package vectorListMar29;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Vector;

public class VectorInjava {

	private static char[] obj;

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		
       Vector v = new Vector<>();
       v.addElement(10);
       v.addElement("Tom");
       v.addElement('c');
       v.addElement(10);
       v.addElement(null);
       v.addElement(10.50f);
       v.addElement(true);
       
       v.add(500);
       v.add(2, "Jerry");
       v.addAll(al);
       v.add(1, al);
      System.out.println(v.contains(500));
      System.out.println(v.containsAll(al));
      System.out.println(v.remove(al));
    //  v.addAll(al);
      System.out.println(v.removeAll(al));
      //pr
    // for(Object obj:v) {
    //	 System.out.println(obj);
   //  }
    	  
     // for(int i=0;i<=v.size();i++) {
    //	  System.out.println(v.get(i));
     // }
      
      
      
       System.out.println(v);
       v.addAll(al);
       System.out.println(v);
       System.out.println(al);
      
      
       
       
       
	}

}
