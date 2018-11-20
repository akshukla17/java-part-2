package com.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestIterator {
	
	public static void main(String[] args) {
		//ConcurrentHashMap
				Map<String,String> myMap = new ConcurrentHashMap<String,String>();
				myMap.put("1", "1");
				myMap.put("2", "1");
				myMap.put("3", "1");
				myMap.put("4", "1");
				myMap.put("5", "1");
				myMap.put("6", "1");
				System.out.println("ConcurrentHashMap before iterator: "+myMap);
				Iterator<String> it = myMap.keySet().iterator();

				while(it.hasNext()){
					String key = it.next();
					if(key.equals("3")) myMap.put(key+"new", "new3");
				}
				System.out.println("ConcurrentHashMap after iterator: "+myMap);

				//HashMap
				myMap = new HashMap<String,String>();
				myMap.put("1", "1");
				myMap.put("2", "1");
				myMap.put("3", "1");
				myMap.put("4", "1");
				myMap.put("5", "1");
				myMap.put("6", "1");
				System.out.println("HashMap before iterator: "+myMap);
				Iterator<String> it1 = myMap.keySet().iterator();

				while(it1.hasNext()){
					String key = it1.next();
					if(key.equals("3")) myMap.put(key+"new", "new3");
				}
				System.out.println("HashMap after iterator: "+myMap);
		/*Map<Integer,Integer> m=new HashMap<>();
		m.put(1, 3);
		m.put(12,2333);
		m.put(6, 4);
		
		Iterator<Integer> itr =m.keySet().iterator();

		while(itr.hasNext()){
			int k=itr.next();
			System.out.println(k);
			if(k ==1){
			itr.remove();
			}
		}*/
	}

}
