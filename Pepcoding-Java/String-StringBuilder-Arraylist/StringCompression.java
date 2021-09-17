input : aaabbbcccdee
output : abcde
output2 : a3b3c3de2  // if there is only one character then no need to put counter as a 1

input : abcd
output1 : abcd
output2 : abcd




import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String s = str.charAt(0) + "";
		
		for(int i=1; i<str.length(); i++){
			
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if(curr != prev)
				s += curr;
		}
		
		return s;
	}

	public static String compression2(String str){
		
		String s = str.charAt(0) + "";
		int counter = 1;
		
		for(int i=1; i<str.length(); i++){
			
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if(curr == prev){
				counter++;
			}else{
				
				if(counter > 1)
					s += counter;
				
				s += curr;
				counter = 1;
			}
		}
		if(counter > 1)
			s += counter;
		
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
