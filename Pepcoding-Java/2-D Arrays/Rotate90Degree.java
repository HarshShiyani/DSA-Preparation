11  12  13  14
21  22  23  24
31  32  33  34
41  42  43  44
  
--- 90 Degree Rotate ---
  
41  31  21  11  
42  32  22  12
43  33  23  13
44  34  24  14

// First transpose the matrix means first row set to 1st column
// Second row set to 2nd column
// and so on and then reverse the columns mean first col set to last column.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            
            int li = 0;
            int ri = arr[0].length - 1;
            
            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                
                li++;
                ri--;
            }
            
            
        }
        
        display(arr);
        
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
