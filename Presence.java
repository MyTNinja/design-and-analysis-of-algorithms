/*
Design and implement an algorithm that searches an unsorted array a[1:n] for the element x. 
If x occurs, then return a position in the array; else return zero. 
Write a program and find the time and space complexity.
*/

import java.util.*;


class Presence{
    //function for linear search
    public static int search(int arr[], int y, int l){
        for(int i = 0; i<l; i++){
            if(arr[i]==y) return i+1;
        }
        return 0;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //taking size input and initialising array
        System.out.print("Input the number of elements to store in the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        //input array
        System.out.println("Input " + n + " number of elements in the array: ");
        for(int i = 0; i<n; i++){
            System.out.print("element - " + i + ": ");
            a[i] = sc.nextInt();
        }
        
        //input number
        System.out.print("Input the number to find: ");        
        int x = sc.nextInt();
        
        //function call
        int pos = search(a, x, n);
        
        //displaying postion
        if(pos==0) System.out.println(x +" not found");
        else System.out.println(x + " is at positon " + pos);
    }
}
