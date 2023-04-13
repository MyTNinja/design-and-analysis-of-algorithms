import java.util.*;

public class JobSequencing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int l = sc.nextInt();

        int[] j = new int[l];
        for(int i = 0; i<l; i++){
            j[i] = i+1;
        }

        int[] d = new int[l];
        int[] p = new int[l];

        System.out.println("\n-----Enter deadlines and profits-----");
        for(int i = 0; i<l; i++){
            System.out.print("\nEnter deadline for job_" + (i+1) + ": ");
            d[i] = sc.nextInt();
            System.out.print("Enter profit for job_" + (i+1) + ": ");
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < l - 1; i++){
            for (int k = 0; k < l - i - 1; k++){
                if (p[k] < p[k + 1]){
                    int temp = p[k];
                    p[k] = p[k + 1];
                    p[k + 1] = temp;

                    temp = d[k];
                    d[k] = d[k + 1];
                    d[k + 1] = temp;

                    temp = j[k];
                    j[k] = j[k + 1];
                    j[k + 1] = temp;

                }
            }
        }

        int max = d[0];
        for(int i = 1; i<l; i++){
            if(d[i]>max){
                max = d[i];
            }
        }

        int[] op = new int[max];

        for(int i = 0; i<l; i++){
            for(int k = d[i]-1; k>=0; k--){
                if(op[k] == 0){
                    op[k] = j[i];
                }
            }
        }

        System.out.print("\nJob sequence: ");
        for(int i = 0; i<max; i++){
            System.out.print("J" + op[i] + " ");
        }

        int sum = 0;
        for(int i = 0; i<max; i++){
            for(int k = 0; k<l; k++){
                if(j[k] == op[i]){
                    sum = sum + p[k];
                }
            }
        }
        System.out.println("\nTotal profit: " + sum);
    }
}

