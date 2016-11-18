package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Steve", 123456);
		td.put("Ram", 456328);
		td.put("Sham", 2568923);
		
		
		for (Map.Entry m: td.entrySet()){
			System.out.println(m.getKey() + " - "  + m.getValue() );
		}
	}

}
