package linkListmar29;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorInJava {

	public static void main(String[] args) {
		 LinkedList ll = new LinkedList<>();
	        ll.add(10);
	        ll.add("tom");
	        ll.add(10.80);
	        ll.add('c');
	        ll.add(10);
	        ll.add(true);
	        ll.add(null);
	        System.out.println(ll);
	    //list iterator is only applicable to link list class and array list class.Iterator is universal.Applicable for all collection 
 
	         ListIterator itr =     ll.listIterator();
	         while(itr.hasNext()) {
	        	 Object obj = itr.next();
	        	 System.out.println(obj);
	         if(obj == Character.valueOf('c')){
	         System.out.println("next index"+itr.nextIndex());
	         System.out.println("previous index"+itr.previousIndex());
	         }
	         }
	//Methods :- (1)add(),hasNext(); , hasPrevious(); , next(); . previous(); ,nextIndex(); , previousIndex();
	         //remove(); , set()
	           //listlitterator is powerful iterator but applicable to list
	         //Normal iterator has only  :- hasnext ,next and  remove 
	}

}
