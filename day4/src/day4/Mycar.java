package day4;


abstract class car {
    public void swift()
   {
        System.out.println("go to swift");
   }



   public void minicar() {
       System.out.println(" go to mini car");
   }
   
   abstract public void choice();
}



class swift extends car{
  
   
   @Override
   public void choice() {
       // TODO Auto-generated method stub
       
   }





}




public class Mycar {



   public static void main(String[] args) {



       swift j= new swift();
         j.swift();
         j.minicar();
        j.choice();
       
   }

}


