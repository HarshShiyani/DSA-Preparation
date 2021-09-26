https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/first-index-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        int x = sc.nextInt();
        
        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length)
            return -1;
        
        // First Index In Smaller Array = fiisa
        int fiisa = 0;
        
        if(arr[idx] == x)
            return idx;
        else
            fiisa = firstIndex(arr, idx+1, x);
            return fiisa;
    }

}
