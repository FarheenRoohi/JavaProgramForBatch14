package mapCollectionMar31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hasMapInJava {

	public static void main(String[] args) {
     //hasMap always store key value pair
		//key is non duplicate 
		// value can be duplicate 
		//both are object.
		HashMap<Object,Object> hm = new HashMap<>();
		hm.put(2001, "tom");
		hm.put(2002, "bob");
		hm.put(2001, 1000);
		hm.put(null, 'c');//one key null is allowed
		hm.put(2003, "roohi");
		hm.replace(2003, "farheen");
		
		hm.replace(2002,"bob", "jerry");
		for(Map.Entry<Object, Object>  eachEntry: hm.entrySet()) {
			System.out.println(eachEntry.getKey()+" = "+eachEntry.getValue());
		}//using entry set
		System.out.println(hm);
		//key value set:-key set return key,value set return value set
		//second way using key and value set
		for(Object eachKey:hm.keySet()) {
			System.out.println("Key="+eachKey+" "+"value="+hm.get(eachKey));
			
		}
		//how to use value set
		for(Object eachvalue : hm.values()) {
			System.out.println("value=" + hm.values());
		}
		//Iterator m=Method
	Iterator<Map.Entry<Object,Object>> itr =	hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Object,Object> eachEntry = itr.next();
			System.out.println(eachEntry.getKey()+" ="+eachEntry.getValue());
		}
		
	}

}
