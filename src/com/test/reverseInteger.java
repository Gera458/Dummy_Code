package com.test;

public class reverseInteger {

	public static void main(String[] args) {
		
		int num=458,rem = 0,rev=0;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
	
		System.out.println(rev);

	}
	

}

/*
 * Algo 1) Take intger value e.g 458 2) Divide this value from 10 to get rem 3)
 * find reverse e.g rev*10+rem 4) find num= num/10
 */