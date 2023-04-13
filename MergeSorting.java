import java.util.*;

public class MergeSorting {
    public static void merge(int[] arr, int beg, int mid, int end) {
        int n1 = (mid-beg) + 1;
        int[] arr1 = new int[n1];
        for(int i = 0; i<n1; i++) {
            arr1[i] = arr[beg+i];
        }
        
        int n2 = (end-(mid+1)) + 1;
        int[] arr2 = new int[n2];
        for(int i = 0; i<n2; i++) {
            arr2[i] = arr[mid+1+i];
        }
        
        int i = 0, j = 0, k = beg;
        
        while(i<n1 && j<n2) {
            if(arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            }
            
            else {
                arr[k++] = arr2[j++];
            }
        }
        
        while(i<n1) {
            arr[k++] = arr1[i++];
        }
        
        while(j<n2) {
            arr[k++] = arr2[j++];
        }
    }
    
    public static void mergeSort(int[] arr, int beg, int end) {
        if(beg < end){
            int mid = (beg+end)/2;
            
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, beg, mid, end);
        }
    }
    
    public static void display(int[] arr, int n) {
        for(int i = 0; i<n; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i<n; i++) {
            System.out.print("-> ");
            arr[i] = sc.nextInt();
        }
      
        int beg = 0;
        int end = n - 1;
      
        System.out.println("\n Unsorted array:");
        display(arr, arr.length);
      
        mergeSort(arr, beg, end);
      
        System.out.println("\n Sorted array:");
        display(arr, arr.length);
    }
}