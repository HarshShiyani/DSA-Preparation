1                       1
1 2                   2 1
1 2 3               3 2 1
1 2 3 4           4 3 2 1
1 2 3 4 5       5 4 3 2 1
1 2 3 4 5 6   6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
  
---------OR--------------
  
1           1
1 2       2 1
1 2 3   3 2 1
1 2 3 4 3 2 1



import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    // 2n - 1 is total column and again 
    // we have to minus 2 columns
    // So 2n - 1 - 2 means spaces in first row is -> 2n - 3
    int sp = 2*n - 3;
    
    for(int i=1; i<=n; i++){
        
        for(int j=1; j<=i; j++){
            System.out.print(j + "\t");
        }
        
        for(int j=1; j<=sp; j++){
            System.out.print("\t");
        }
        
        for(int j=i; j>=1; j--){
            if(j == n)
                j--;
            System.out.print(j + "\t");
        }
        
        sp -= 2;
        
        System.out.println();
    }
    
 }
}
