Input : 2,5
Output : 32
Explaination : 2 * 2 * 2 * 2 * 2 
               Here, Multiply 2 Five times.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        
        if(n == 0)
            return 1;
        
        return x * power(x, n-1);
    }

}
