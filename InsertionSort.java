/*
Implementation of Insertion Sort
 */

import java.util.*;


class InsertionSort{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int size;
        
        //taking size input and initialising array
        System.out.print("Enter array size: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        
        //input array
        System.out.println("Input " + size + " elements in the array: ");
        for(int i = 0; i<size; i++){
            System.out.print("element - " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        //display unsorted array
        System.out.println("The unsorted array is: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        //insertion sort
        int key, j;
        for(int i = 1; i<size; i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        
        //display sorted array
        System.out.println("The sorted array is: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}