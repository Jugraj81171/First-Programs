package collections;

import java.util.HashSet;
import java.util.Set;

public class demoSet {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(20);
        set.add(300);
        set.add(10);
        set.add(40);
        set.add(50);
        System.out.println(set);
        for(Integer e:set)
        {
            System.out.println(e);
        }

        }
}

