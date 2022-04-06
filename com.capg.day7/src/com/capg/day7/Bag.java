package com.capg.day7;

public class Bag {

   int id;
   String bagName;
   int Price;
   public void bag(int id,String bagName,int Price) {
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

}
