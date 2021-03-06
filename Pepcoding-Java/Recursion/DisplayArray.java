https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/display-array-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
            
        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length)
            return;
        
        System.out.println(arr[idx]);
        displayArr(arr, idx+1);
    }

}

// --- My Code ---

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
            
        displayArr(arr, n-1);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx < 0)
            return;
        
        displayArr(arr, idx-1);
        System.out.println(arr[idx]);
        
    }

}
