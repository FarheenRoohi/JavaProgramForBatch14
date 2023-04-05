package linkListmar29;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListInJava {

	public static void main(String[] args) {
        LinkedList<Comparable> ll = new LinkedList<Comparable>();
        ll.add(10);
        ll.add("tom");
        ll.add(10.80);
        ll.add('c');
        ll.add(10);
        ll.add(true);
        ll.add(null);
        System.out.println(ll);
        ll.add(2,"bob");
        ll.addFirst("Roohi");
        ll.addLast("Farheen");
       // System.out.println(ll.contains("roohi"));
       // System.out.println(ll.getFirst());
        //System.out.println(ll.getLast();
        
       // System.out.println(ll);
    //  System.out.println(ll.getFirst());
       // System.out.println(ll.getLast());
    // System.out.println(ll.poll());
      //  System.out.println(ll.pollFirst());
     // System.out.println(ll.pop());
       // System.out.println(ll.getLast());
      //System.out.println(ll);
        //System.out.println(ll.getLast();
       ListIterator<Comparable> itr =ll.listIterator();
      while(itr.hasNext()) {
      Object obj = itr.next();
      System.out.println(obj);
       if(obj == Character.valueOf('c')) {
       System.out.println("next"+itr.nextIndex());
      }
      } 
	}

}
