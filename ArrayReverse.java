/*
Write a program to read n number of values in an array and display it in reverse order.  
Test Data :
Input the number of elements to store in the array :3
Input 3 number of elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 7
Expected Output :
The values store into the array are :
2 5 7
The values store into the array in reverse are :
7 5 2
*/

import java.util.*;


class ArrayReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //taking size input and initialising array
        System.out.print("Input the number of elements to store in the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        //input array
        System.out.println("Input " + size + " number of elements in the array: ");
        for(int i = 0; i<size; i++){
            System.out.print("element - " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        //display original array
        System.out.println("The values store into the array are: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        //display reverse array
        System.out.println("The values store into the array in reverse are: ");
        for(int i = size - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}