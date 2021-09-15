input: abcc
output:
a
b
cc
c

--------------------------------------




import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean isPalindrome(String substr){
        
        int i = 0;
        int j = substr.length() - 1;
        while(i <= j){
            if(substr.charAt(i) != substr.charAt(j))
                return false;
            
            i++;
            j--;
        }
        
        return true;
        
    }
    
	public static void solution(String str){
		for(int i=0; i<str.length(); i++){
		    for(int j=i+1; j<=str.length(); j++){
		        String substr = str.substring(i,j);
		        
		        if(isPalindrome(substr) == true)
		            System.out.println(substr);
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
