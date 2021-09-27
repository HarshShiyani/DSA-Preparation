https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/last-index-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        
        int x = sc.nextInt();
        System.out.println(lastIndex(arr,0,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length)
            return -1;
        
        int liisa = lastIndex(arr, idx+1, x);
        
        if(liisa == -1){
            if(x == arr[idx])
                return idx;
            else
                return -1;
        }else
            return liisa;
        
    }

}
