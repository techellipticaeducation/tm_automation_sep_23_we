package collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	// Dictionary
	
	Map<String,String> mp = new HashMap<String, String>();
	mp.put("name", "Vaibhav");
	mp.put("age", "30");
	mp.put("occupation", "IT");
	mp.put("name", "Pratap");
	
	
	// BAT
	// word - key - never duplicate
	// meaning - value - can be duplicate
	
//	System.out.println(mp.containsKey("sdkjasdkh"));
	
	Set<String> allKeys = mp.keySet();
	for(String key : allKeys) {
		System.out.println(key + " - " + mp.get(key) );
	}
}
}
