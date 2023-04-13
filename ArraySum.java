/*
Write a program to find the sum of all elements of the array. 
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 8
Expected Output :
Sum of all elements stored in the array is : 15
*/

import java.util.*;


class ArraySum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //taking size input and initialising array
        System.out.print("Input the number of elements to be stored in the array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        int sum = 0;
        
        //input array
        System.out.println("Input " + size + " number of elements in the array: ");
        for(int i = 0; i<size; i++){
            System.out.print("element - " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        //adding into and displaying sum
        for(int i = 0; i<size; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements stored in the array is: " + sum);
    }
}