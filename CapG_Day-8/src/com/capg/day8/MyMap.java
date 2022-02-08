package com.capg.day8;
import java.util.*;
public class MyMap {
	public static void main(String[] args) {
		//we can user 2 parameters
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1001, "Sakshi");
		map.put(1002, "Sanjal");
		map.put(1003, "Disha");
		map.put(1004, "Smita");
		map.put(1005, "Suvidhee");
		
		System.out.println(map); //map does not hold key as duplicate
		System.out.println("-------------------------------------------------");
		System.out.println(map.get(1002));
		System.out.println("-------------------------------------------------");
		Set<Integer> keys = map.keySet();
		for(Integer key:keys) {
			System.out.println("-------------------------------------------------");
			System.out.println("key: " +key + " ,value: "+map.get(key));
			
		}
		System.out.println(keys);
		System.out.println("-------------------------------------------------");
		Map<Integer,Student> map2 = new HashMap<Integer, Student>();
		map2.put(1000, new Student(1001,"Sakshi","Shah","SSS"));
		System.out.println(map2);
	}
}
