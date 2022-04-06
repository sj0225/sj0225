package day3.com.capg;

public class Mytry {

	public static void main(String[] args) {
		try
		{
		 int data=50/0;
		}
		
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		
		    finally {
		    	System.out.println("Please check ");
		}

	}
}

