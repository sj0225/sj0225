package com.capg.day7;

import java.util.HashMap;

public class Mybag {
   int id;
   String bagName;
   int Price;
   public Mybag(int id,String bagName,int Price) {
	   this.id=id;
	   this.bagName = bagName;
	   this.Price = Price;
	   
   }public String toString() {
		String bagPrice=null;
		return "bag[id="+id+",bagName="+bagName+",bagPrice="+bagPrice+"]";
	}
   
   public String getbagName() {
	   return bagName;
   }
   public void setbagName(String bagName) {
	   this.bagName=bagName;
   }
   public int getPrice() {
	   return Price;
   }
   public void setbagName(int Price) {
	   this.Price=Price;
	   
   }
   public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	Mybag bag1=new Mybag(12,"hp",1000);
	Mybag bag2=new Mybag(13,"Dell",1500);
      System.out.println(bag1);
      System.out.println(bag2);
	map.put("hp",1000);
	System.out.println(map);
	
	
}
   
}
