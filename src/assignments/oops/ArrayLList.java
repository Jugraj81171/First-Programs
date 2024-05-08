package assignments.oops;

import java.util.*;

public class ArrayLList {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        List<Integer> list2=new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list1.get(3));
        list1.add(50);
        System.out.println(list1);
        System.out.println(list1.indexOf(40));
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);


    }
}
