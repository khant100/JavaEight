package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_Eight {

	
	
	public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);
        Map<Integer,String > numberMapping2 = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping2.put( 1,"One");
        numberMapping2.put( 2,"Two");
        numberMapping2.put(3,"Three");

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping2.putIfAbsent(4,"Four");

        System.out.println(numberMapping2);
	
        /// hi 
	
	
	
	}
	
	
	
	
}
