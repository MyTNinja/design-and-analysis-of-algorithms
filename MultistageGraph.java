import java.util.*;

public class MultistageGraph {
    static int n = Integer.MAX_VALUE;
    
    public static int shortest(int[][] G, int v) {
        int[] cost = new int[v];
        
        cost[v-1] = 0;
        
        for(int i = v-2; i>=0; i--) {
            cost[i] = n;
            
            for(int j = i; j<v; j++) {
                if(G[i][j] == n) {
                    continue;
                }
                
                cost[i] = Math.min(cost[i], (G[i][j] + cost[j]));
            }
        }
        
        return cost[0];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        int[][] G = new int[v][v];
        
        for(int i = 0; i<v; i++) {
            System.out.println("Enter adjacency value for vertex_" + (i+1) + ": ");
            for(int j = 0; j<v; j++) {
                G[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nEnter costs for vertices: ");
        for(int i = 0; i<v; i++) {
            for(int j = 0; j<v; j++) {
                if(G[i][j] == 0) {
                    G[i][j] = n;
                    continue;
                }
                System.out.print((i+1) + " to " + (j+1) + ": ");
                G[i][j] = sc.nextInt();
                
            }
        }

        System.out.println("\nAnswer is " + shortest(G, v));    
    }
}
