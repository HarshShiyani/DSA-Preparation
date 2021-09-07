// Print fibonaci series

0
1	1	
2	3	5	
8	13 21 34	



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        int cur = 0; int next = 1;
        int val = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(cur + "\t");
                val = cur+next;
                cur = next;
                next = val;    
            }
            System.out.println();
        }
        

    }
}
