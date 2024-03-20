package Collections_Concept;

import java.util.Iterator;

public class HashMap {
	
	public void HashMapEx() {
		java.util.HashMap<Integer,String> hashMap = new java.util.HashMap<>();
		hashMap.put(1," Hey Pam");
		hashMap.put(2," Can you ");
		hashMap.put(3," Wait for me ");
		hashMap.put(4," Until i tie my shoes");
		hashMap.put(5," I hate you");
		System.out.println("The Map is "+hashMap);
		
		//Copying to another 
		java.util.HashMap<Integer,String> duplicatemap = new java.util.HashMap<>();
		duplicatemap.putAll(hashMap);
		System.out.println("After copying to another map"+duplicatemap);
		
		//Clear
		duplicatemap.clear();
		System.out.println("After clearing "+duplicatemap);
		
		System.out.println(hashMap.containsKey(5));
		System.out.println(hashMap.containsValue(" I hate you"));
		System.out.println(hashMap.clone());
		System.out.println(hashMap.isEmpty());
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.get(5));
		System.out.println(hashMap.values());
		System.out.println(hashMap.entrySet());
			
	}
	
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.HashMapEx();
	}
}


