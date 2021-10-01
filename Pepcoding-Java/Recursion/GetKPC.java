import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> kpc = getKPC(str);
        System.out.println(kpc);
    }
    
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> myres = new ArrayList<String>();
        
      
      // if i write codes[ch] then it will return error
      // because '6' != 6
      // ascii value of 0 = 48, 1=49,....6 = 54
      // '6' - '0' means 54 - 48 = 6
      // ASCII code 6 compare to 6 which is right.
        String codeforch = codes[ch - '0'];
        for(int i=0; i<codeforch.length(); i++){
            
            char chcode = codeforch.charAt(i);
            
            for(String rstr : rres){
                myres.add(chcode + rstr);
            }
            
        }
       
       return myres; 
    }

}
