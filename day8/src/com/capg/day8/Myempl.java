package com.capg.day8;
import java.util.ArrayList;
public class Myempl {
	public static void main(String[] args) {
		ArrayList<Myemp> em=new ArrayList<Myemp>();
		em.add(new Myemp(1,"sj",1000));
		em.add(new Myemp(2,"bj",2000));
		em.add(new Myemp(3,"nj",5000));
		
		em.stream().forEach(e->System.out.println(e));
		em.stream().filter(e->e.getSalary()>1000).forEach(e->System.out.println(em));
	}

}