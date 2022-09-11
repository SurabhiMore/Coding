// prints distinct integers (sorted)
package Hashing;
import java.util.*;
public class distinct {
    
    public static void main(String[] args){

        int arr[] = {5, 10, 15, 5, 4, 5};
        Set<Integer> set = new HashSet<Integer>(arr.length);
        for(int num: arr){
            set.add(num);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}

// returns int array with distinct elements - Hashing
/* 
Set<Integer> set = new HashSet<Integer>(N);
ArrayList<Integer> list = new ArrayList<>();
for(int i=0; i<N; i++){
    if(!set.contains(A[i])){
        set.add(A[i]);
        list.add(A[i]);
    }
}
int[] arr = new int[list.size()];
int i = 0;
for(int n: list){
    arr[i] = n;
    i+=1;
}
return arr;
*/