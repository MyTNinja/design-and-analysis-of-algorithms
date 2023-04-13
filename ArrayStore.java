/*
Write a program to store elements in an array and print it.  
Test Data :
Input 10 elements in the array :
element - 0 : 1
element - 1 : 1
element - 2 : 2
.......
Expected Output :
Elements in array are: 1 1 2 3 4 5 6 7 8 9
 */

import java.util.*;


class ArrayStore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10];
        
        //array input
        System.out.println("Input 10 elements in the array: ");
        for(int i = 0; i<10; i++){
            System.out.print("element - " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        //displaying array
        System.out.print("Elements in array are: ");
        for(int i = 0; i<10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}