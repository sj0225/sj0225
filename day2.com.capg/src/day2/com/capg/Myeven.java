package day2.com.capg;

public class Myeven {

	public static void main(String[] args) {
		int num=100;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0) {
				System.out.println("The even Number is "+i);
			}
		}
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0) {
				System.out.println("The odd Number is "+i);
			}
		}
	}

}
