package day2.com.capg;
import java.util.Scanner;
public class Myyear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter Year = ");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		 {
			System.out.println("It the leaf year ");
		}
		else
			System.out.println("It is not leaf year ");
	}

}

