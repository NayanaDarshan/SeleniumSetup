package BasicWeb;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		String Str= "*******";
	    int len= Str.length();
	    
	    System.out.println(len);
	    
	    String rev= "";
	    
	    for ( int i=len-1; i>=0; i--) {
	    
	    	rev= rev+Str.charAt(i);
	    	System.out.println(rev);
	    
	    }
	  /*  System.out.println(rev);
	    
		String Str= "SmiraNayana";
	    
	    StringBuffer str1 = new StringBuffer(Str);
	    
	    System.out.println(str1.reverse()); */
	     
	    	
	    
	    }
	}

	

