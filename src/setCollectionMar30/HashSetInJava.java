package setCollectionMar30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(200);
		al.add('c');
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Tom");
		hs.add('c');
		hs.add(10.90);
		hs.add(null);
		hs.add(10);
		hs.add(hs);
		//System.out.println(hs.add(10));
		//System.out.println(30);
		// hs.addAll(al);	
        //System.out.println(hs);
       // hs.retainAll(al);
       // System.out.println(hs);
        //if get is not available 
	//	if you know the nuber of eliment
        //for(Object obj : hs) {
        //	System.out.println(obj);}
       // if we dont know the no of iteration want to use use for loop then how to use iterator.
		//to know the phases element 1 by 1.
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
			
		}
        
        	
        	
	}

}
