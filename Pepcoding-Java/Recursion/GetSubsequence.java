https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-subsequence-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    ArrayList<String> res = gss(s);
    System.out.println(res);
  }

  public static ArrayList<String> gss(String str) {
    
    if(str.length() == 0){
        ArrayList<String> bres = new ArrayList<>();
        bres.add("");
        return bres;
    }
    
    char ch = str.charAt(0);
    String sub = str.substring(1);
    ArrayList<String> rsub = gss(sub);

    ArrayList<String> myres = new ArrayList<>();
    for(String temp : rsub){
        myres.add("" + temp);
    }
    for(String temp : rsub){
        myres.add(ch + temp);
    }
    
    return myres;
  }

}
