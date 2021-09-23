Input : 5
Output :
5
4
3
2
1
1
2
3
4
5
  



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n == 0)
            return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
        
    }

}
