package day3.com.capg;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
class OnlyOddNumberAllowed extends Exception
{
    OnlyOddNumberAllowed(String msg)
    {
        super(msg);
    }
}
public class MyCustomException {

 

    public static void main(String[] args)
    		throws OnlyOddNumberAllowed {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the Number is  " +num);
        if(num%2==0)
        {
            System.out.println("the number is even "+num);
        }
        else
        {
        	System.out.println("the number is odd "+num);
        }
        {
           throw new OnlyOddNumberAllowed("Enter Only even Number");   
        }
        
        
    }
}