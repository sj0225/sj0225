package day4;
class  person{
	public void car()
{
		System.out.println("Drive the car");
		}
	public void bike(String bike ) {
		System.out.println("driving the bike");
	}
	public void truk(String Truk) {
		System.out.println("Drive the truk");
	}
}
class people extends person{

		
	}
public class Mypoly {
	public static void main(String[] args) {
		person person=new person();
		person.car();
		person.truk("Truk");
		

		
	}

}

