import java.util.*;


class Ends {
    int max;
    int min;
}

public class MaxMinDnC {
    public static Ends maxMin(int[] arr, int beg, int end) {
        Ends obj1 = new Ends();
        Ends obj2 = new Ends();
        Ends obj3 = new Ends();
        
        if(end-beg <= 1) {
            obj3.max = Math.max(arr[beg], arr[end]);
            obj3.min = Math.min(arr[beg], arr[end]);
            
            return obj3;
        }
        int mid = (beg+end)/2;
        
        obj1 = maxMin(arr, beg, mid);
        obj2 = maxMin(arr, mid+1, end);
        
        obj3.max = Math.max(obj1.max, obj2.max);
        obj3.min = Math.min(obj1.min, obj2.min);
        
        
        return obj3;
    }
    
    public static void display(Ends obj) {
        System.out.println("Maximum: " + obj.max);
        System.out.println("Minimum: " + obj.min);
    }
    
    public static void main(String args[]) {
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
        int end = arr.length - 1;
        
        display(maxMin(arr, beg, end));
    }
}
