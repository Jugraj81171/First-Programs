package collections;
import java.util.*;

public class duplicateElement {
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> set =new LinkedHashSet<Integer>(list);
        return new ArrayList<>(set);

    }

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(0,304,50,203,503,23,30,50,203,503,22,100);
        System.out.println(removeDuplicates(list));
        //to add the elements of the new list
        List<Integer> newlist=removeDuplicates(list);
        Iterator<Integer> is=newlist.iterator();
        int sum=0;
        for(Integer s:newlist)
        {
            Integer element=is.next();

           sum= sum +element;


        }
        System.out.println(sum);


    }
}
