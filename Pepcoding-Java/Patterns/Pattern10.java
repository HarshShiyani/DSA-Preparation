    *
  *   *
*       *
  *   *
    *


import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int is = n/2; // InnerSpace
    int os = -1; // OuterSpace
    
    for(int i=1; i<=n; i++){
        
        for(int j=1; j<=is; j++){
            System.out.print("\t");
        }
        
        System.out.print("*\t");
        
        for(int j=1; j<=os; j++){
            System.out.print("\t");
        }
        
        if(i<=n/2){
            is--;
            os+=2;
        }
        else{
            is++;
            os-=2;
        }
        
        if(i>1 && i<n)
            System.out.print("*");
        System.out.println();
    }
    

 }
}
