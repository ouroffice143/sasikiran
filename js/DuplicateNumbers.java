package com.reg.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateNumbers 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many numbers you want to enter?: ");
		int a[]=new int[Integer.parseInt(br.readLine())];
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("enter elements in an array");
			a[i]=Integer.parseInt(br.readLine());			
		}
		int count=0;
		for (int j = 0; j < a.length; j++) {
			count=0;
			for (int i = j; i < a.length; i++) {
				
				if(a[j]==a[i])count++;
			}
			if (count!=0) 
			{
			System.out.println(a[j]+""+count+"times");	
			}
		}
		
		
		
	}
}


