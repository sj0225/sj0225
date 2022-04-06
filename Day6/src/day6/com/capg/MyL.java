package day6.com.capg;
import java.util.*;


public class MyL {

 
 public static void main(String args[])
 {
     
     LinkedList<String> ls = new LinkedList<String>();
     ls.add("A");
     ls.add("B");
     ls.addLast("D");
     ls.addFirst("A");
     ls.add(2, "E");

     System.out.println(ls);

     ls.remove("B");
     ls.remove(3);
     ls.removeFirst();
     ls.removeLast();

     System.out.println(ls);
 }
}