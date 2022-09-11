package Arrays_Strings;
import java.util.Scanner;
public class Min_Max {

    static int min(int arr[]){
        int min = arr[0];
        for(int num: arr){
            if(min>num){
                min = num;
            }
        }
        System.out.println(min);
        return min;
    }

    static int max(int arr[]){
        int max = arr[0];
        for(int num: arr){
            if(max<num){
                max = num;
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int maxno = max(arr);
        int minno = min(arr);
        System.out.println(maxno+minno);
    }
}
