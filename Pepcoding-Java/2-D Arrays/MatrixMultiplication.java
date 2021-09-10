Notes:
-> first matrix is 2 x 3  and second matrix is 3 * 3, to multiply this matrices, col of first and row of sec must be same.
-> to create result array, you have to set first matrix row as a row and column of sec matrix as a column.


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int arr1[][] = new int[r1][c1];
    
    for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
            arr1[i][j] = sc.nextInt();
        }
    }
    
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int arr2[][] = new int[r2][c2];
    
    if(c1 != r2){
        System.out.println("Invalid input");
        return;
    }
    
    for(int i=0; i<r2; i++){
        for(int j=0; j<c2; j++){
            arr2[i][j] = sc.nextInt();
        }
    }
    
    int res[][] = new int[r1][c2];
    
    for(int i=0; i<res.length; i++){
        for(int j=0; j<res[0].length; j++){
            for(int k=0; k<c1; k++)
                res[i][j] += arr1[i][k] * arr2[k][j];
        }
    }
    
    for(int i=0; i<res.length; i++){
        for(int j=0; j<res[0].length; j++){
            System.out.print(res[i][j] + " ");
        }
        System.out.println();
    }
    
 }

}
