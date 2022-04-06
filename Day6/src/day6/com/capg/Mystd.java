package day6.com.capg;

public class Mystd {

	private int id;
	private String name;
	private String fees;
	public Mystd(int id,String name,String fees) {
		this.id= id;
		this.name =name;
		this.fees= fees;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public String getName() {
		return name;
	}	
	public void SetName(String name) {
		this.name= name;
	}	
	public String getFees() {
		return fees;
	}
	public void setfees(int id) {
		this.fees=fees;
		
	}
}
