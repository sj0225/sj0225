package day6.com.capg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
public class Mylinklist {

    public static void main(String[] args) {
        Vector<Integer> ls = new Vector<Integer>();
        ls.add(15);
        ls.add(20);
        ls.add(10);
        ls.add(100);
        ls.add(35);
        Collections.sort(ls,Collections.reverseOrder());
        System.out.println(ls.contains(101));
        System.out.println(ls.equals(35));
        ls.forEach(System.err::println);
        System.out.println(ls.isEmpty());
        System.out.println(ls);
        Iterator<Integer> it = ls.iterator();
        while (it.hasNext()) {
            System.out.println("it "+it.next());
        }
        ls.size();
        ls.set(0, 45);
        System.out.println(ls);
        System.out.println(ls);
      System.out.println(ls);
      System.out.println(ls);
      System.out.println(ls);
      
    }

 

}
