package com.test;

public class reverse_String {
	
	
	public static void main(String[] args) {
	
		String str="Mukul";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}

}

/*
 * Algo
 * 
 * 1) Create string 2) Take varibale rev in which we want to store rev string 3)
 * Start revese loop becuase we need reverse of string 4) concat
 * rev+str.charAt(i)
 */
