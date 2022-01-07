// Todo: Binary to decimal : Program for numbers like 20 bits or 30 bits.

import java.util.*;
import java.lang.Math;

class BinaryToDecimal{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of s: ");
        String s = sc.next();
        btod(s);
    }
    static void btod(String s){
        int i = 0;
      
        char[] str = s.toCharArray();
	    int dec_val= 0;
	    
	    for (int j=str.length-1; j>=0 ;j-- ){
	        int k= Integer.valueOf(str[j]) - '0';
	        
	        System.out.println("value of k: " + k);
	         dec_val += k*(Math.pow(2, i));
             i++;
	        
	    }
	    System.out.println("the decimal value of " + s + "is " + dec_val);
    }
}