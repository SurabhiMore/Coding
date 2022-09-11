package Hashing;
import java.util.*;
public class hashset {

    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<Integer>(10);
        set.add(5);
        set.add(10);
        set.add(2);
        System.out.println(set);
        
        set.remove(10);

        if(set.contains(10)){
            System.out.println("yes, 10 is present");
        }
        else{
            System.out.println("10 Absent");
        }

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set.isEmpty());
    }
}
