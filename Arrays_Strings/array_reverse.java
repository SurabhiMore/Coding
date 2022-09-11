package Arrays_Strings;

// Recursive method
import java.util.Scanner;

public class array_reverse {
    
    // main function
    static void reverseArray(int arr[], int start, int end){
        int temp;
        if(start>=end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }

    static void printArray(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = input.nextInt();
        }
        printArray(arr, n);
        reverseArray(arr, 0, n-1);
        printArray(arr, n);
    }
}
