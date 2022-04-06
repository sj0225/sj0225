package com.capg.day8;



public class Myemp {
	
	
	@Override
	public String toString() {
		return "Myemp [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
	}
	int id ;
	String Name;
	int salary;
	public Myemp(int id ,String Name,int salary) {
		this.id=id;
		this.Name= Name;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
