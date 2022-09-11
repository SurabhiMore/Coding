package Arrays_Strings;

// Iterative method

import java.util.Scanner;

public class reverse_array {
    
    // main function
    static void reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            start+=1;
            end-=1;   
        }
    }

    static void printArray(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] arr = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            arr[i] = input.nextInt();
        }
        printArray(arr, arraySize);
        reverseArray(arr, 0, arraySize-1);
        printArray(arr, arraySize);
    }
}
