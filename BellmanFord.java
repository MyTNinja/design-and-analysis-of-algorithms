import java.util.*;

public class BellmanFord {
    static int n = 99999;
    
    public static void bellman(int[][] G, int S, int v, int e) {
        int[] dist = new int[v];
        int[] prev = new int[v];
        
        for(int i = 0; i<v; i++) {
            dist[i] = n;
            prev[i] = -1;
        }
        dist[S] = 0;
        
        int temp = 0;
        
        int k = 0;
        while(k<v) {
            for(int i = 0; i<v; i++) {
                for(int j = 0; j<v; j++) {
                    if(G[i][j] == n) {
                        continue;
                    }
                    temp = dist[i] + G[i][j];
                    if(temp<dist[j]) {
                        dist[j] = temp;
                        prev[j] = i;
                    }
                }
            }
            k++;
        }
        
        for(int i = 0; i<v; i++) {
            for(int j = 0; j<v; j++) {
                temp = dist[i] + G[i][j];
                if(temp<dist[j]) {
                    System.out.println("ERROR");
                }
            }
        }

        System.out.println("\n> SHORTEST DISTANCES from source:\nVertex\t\tDistance\tPath");
        for (int i = 0; i < v; i++) {
        System.out.print(i + "\t\t\t" + dist[i] + "\t\t\t");
        printPath(prev, i);
        System.out.println();
        }
    }
    
    public static void printPath(int[] pred, int v) {
        if (v == 0) System.out.print(v);
        else if (pred[v] == -1)   System.out.print("No path");
        else {
            printPath(pred, pred[v]);
            System.out.print(" -> " + v);
        }
    }
    
    public static void main(String args[]) {       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
        
        int[][] G = new int[v][v];
        
        for(int i = 0; i<v; i++) {
            System.out.println("Enter adjacency cost value for vertex_" + (i+1) + ": ");
            for(int j = 0; j<v; j++) {
                G[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i<v; i++) {
            for(int j = 0; j<v; j++) {
                if(G[i][j] == 0) {
                    G[i][j] = n;
                }
            }
        }

        
        System.out.print("Enter start vertex: ");
        int S = sc.nextInt();
      
        bellman(G, S, v, e);
    }
}
