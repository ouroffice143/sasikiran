package com.reg.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int num = Integer.parseInt(br.readLine());
		
		if(num%2!= 0 && num%3 != 0 && num%5 != 0 && num%7 != 0 && num%9 != 0 && num%11 != 0)
        {
            System.out.println(num + " is  prime number.");
        }
       else
     System.out.println(num + " is not a prime number.");   
	}
}
