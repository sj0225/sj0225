package day6.com.capg;
class Employee<A,B,C>{
	A id;
	B name;
	C salary;
	
	public Employee(A id,B name,C salary) {
		
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return"Employee[id="+id+",name="+name+",salary="+salary+"]";
		
	}
	public void print() {
		System.out.println("id is"+id);
		System.out.println("name is"+name);
		System.out.println("salary is"+salary);
	}
}

public class Mygen {
	Employee<Integer,String,Integer>e1=new Employee<Integer,String,Integer>(1001,"abc",10);{
	System.out.println(e1);
   Employee<Integer,String,String>e2=new Employee<Integer,String,String>(1001,"abc","abc");{
	System.out.println(e2);
   Employee<Integer,String,Double>e3=new Employee<Integer,String,Double>(1001,"abc",10.50);{
	System.out.println(e3);
   
}
   }
	}
}

