/*
Write a program to copy the elements of one array into another array.  
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 15
element - 1 : 10
element - 2 : 12
Expected Output :
The elements stored in the first array are :
15 10 12
The elements copied into the second array are :
15 10 12

*/

import java.util.*;


class ArrayCopy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //taking size input and initialising array
        System.out.print("Input the number of elements to be stored in the array: ");
        int size = sc.nextInt();
        
        int arr1[] = new int[size];
        int arr2[] = new int[arr1.length];
        
        //input array
        System.out.println("Input " + size + " number of elements in the array: ");
        for(int i = 0; i<arr1.length; i++){
            System.out.print("element - " + i + ": ");
            arr1[i] = sc.nextInt();
        }
        
        //copying arr1 into arr2
        arr2 = arr1.clone();
        
        //displaying arr1
        System.out.println("The elements stored in the first array are: ");
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        
        //displaying arr2
        System.out.println("The elements stored in the second array are: ");
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}