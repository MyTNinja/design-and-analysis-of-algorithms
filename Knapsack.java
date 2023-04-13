import java.util.*;


public class Knapsack{
    public static void bubbleSort(double[] p, double[] w){
        int l = p.length;
        
        double[] pdw = new double[l];
        for(int i = 0; i<l; i++){
            pdw[i] = p[i]/w[i];
        }
    
        for (int i = 0; i < l - 1; i++){
            for (int j = 0; j < l - i - 1; j++){
                if (pdw[j] < pdw[j + 1]){
                    double temp = pdw[j];
                    pdw[j] = pdw[j + 1];
                    pdw[j + 1] = temp;
                    
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                    
                    temp = w[j];
                    w[j] = w[j + 1];
                    w[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter max weight: ");
        int W = sc.nextInt();
    
        System.out.print("Enter no. of items: ");
        int n = sc.nextInt();
    
        double[] w = new double[n];
        double[] p = new double[n];
    
        System.out.println("\n-----Enter weights and profits-----");
        for(int i = 0; i<n; i++){
            System.out.print("\nweight_" + (i+1) + ": ");
            w[i] = sc.nextDouble();
            System.out.print("profit_" + (i+1) + ": ");
            p[i] = sc.nextDouble();
        }
        
        bubbleSort(p, w);
        
        double[] x = new double[n];
        
        double weight = 0.0;
        for(int i = 0; i<n; i++){
            if(weight+w[i]<W){
                x[i] = 1;
                weight = weight + w[i];
            }
            else{
                x[i] = (W - weight)/w[i];
                break;
            }
        }
            
        System.out.print("\nKnapsack: ");
        for(int i = 0; i<n; i++){
            System.out.print(x[i] + "\t");
        }
        
        double profit = 0.0;
        for(int i = 0; i<n; i++){
            profit = profit + (x[i]*p[i]);
            
        }
        System.out.println("\nProfit = " + profit);
    }
}