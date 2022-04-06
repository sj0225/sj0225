package com.capg.day7;

class Mythr extends Thread
{

 

    @Override
    public void run() {
        // TODO Auto-generated method stub
       
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        
    }
}

 

public class Myth {
public static void main(String[] args) {
    
	Mythr t1=new Mythr();
	Mythr t2=new Mythr();
    t1.setName("A");
    t2.setName("B");
    t2.setPriority(10);
    t1.start();
    t2.start();
}
}
