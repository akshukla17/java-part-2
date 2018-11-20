package com.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringB {

	public static void main(String[] args) {
		Map<String, Object> map =new HashMap<String,Object>();
		List<String> list =new ArrayList<>();
		
		for(int i=0;i<5;i++){
			StringBuffer sb= new StringBuffer();
			String j="abc";
			if(i==1 || i==2){
				j=null;
			}
			sb.append(j);
			list.add(sb.toString());
		}
		map.put("data", list);
		map.put("a",null);
		map.put("b",null);
		System.out.println(map);
		if(map.isEmpty()){
			System.out.println("The map is empty");
		}else{
			System.out.println("\nmap data: "+map);
		}
	}

}
