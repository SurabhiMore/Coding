package Hashing;
import java.util.*;
public class intersection {
    
    static int intersect(int a[], int b[]){
        Set<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int x:a){
            set.add(x);
        }

        for(int y:b){
            if(set.contains(y)){
                count += 1;
                set.remove(y);
            }
        }

        return count;
    }

    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {3, 4, 5, 6, 7};
        System.out.println(intersect(a, b));
    }
}
