package com.capg.day7;
import java.util.Hashtable;
import java.util.Set;
import java.util.HashSet;
public class Mymap {
	public static void main(String[] args) {
		Hashtable<Integer,String>map=new Hashtable<Integer,String>();
		map.put(101,"sj");
		map.put(102,"SJ");
		map.put(103,"BJ");
		System.out.println(map.get(101));
		
	Set<Integer>keys=map.keySet();
	
	for(Integer key:keys) {
		System.out.println("key "+key+" evalue " +map.get(101));
		
	}
	System.out.println(map.size());
	map.remove(103);
	System.out.println(map.remove(103));
	System.out.println(map.replace(102, "sagar"));
	
	
	}	
		
	}


