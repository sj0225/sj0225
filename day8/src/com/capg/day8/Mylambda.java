package com.capg.day8;
@FunctionalInterface
interface Lambda {
public void print();
}
interface mulInterface {
    public void mul(int a, int b);
}
public class Mylambda {
	public static void main(String[] args) {
		 int j = 10;
		 Lambda result = ()-> System.out.println("example lambda");
	        result.print();
	        mulInterface mulInterface = (int a, int b) -> {
	            int c = a * b;
	            System.out.println(c);
	        };
	        mulInterface.mul(10, 10);
	    }
	    public static void print() {
	        System.out.println("sj");
	    }
	    public static void multiNumber(int a, int b) {
	        int c = a * b;
	        System.out.println(c);
	}

}
