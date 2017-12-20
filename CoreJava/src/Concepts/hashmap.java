package Concepts;

import java.util.*;

public class hashmap {
	public static void main(String[] args){
		HashMap<Integer,String> obj = new HashMap<Integer, String>();
		obj.put(1, "Ankur");
		obj.put(2, "Anku");
		obj.put(3, "Ank");
		obj.put(4, "An");
		obj.put(5, "A");
		
		String str = obj.get(2);
		System.out.println(str);
		
		Set obj1 = obj.entrySet();
		Iterator obj2 = obj1.iterator();
		while(obj2.hasNext()){
		Map.Entry obj3 = (Map.Entry)obj2.next();
		System.out.println("Key is " +obj3.getKey() + " & value is " + obj3.getValue());
		}
		
		
	}
}
