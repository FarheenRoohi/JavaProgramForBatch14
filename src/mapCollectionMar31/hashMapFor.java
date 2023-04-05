package mapCollectionMar31;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashMapFor {

	private static Entry<String, String> eachEntry;

	public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
	 
	hm.put("2001", "tom");
	hm.put("2004", "jerry");
	for(Map.Entry<String, String> eachEntry:hm.entrySet());
	System.out.println();
	}

}
