package com.reg.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleFactorof3 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many numbers you want to enter?: ");
		//int n = Integer.parseInt(br.readLine());
		int a[]=new int[Integer.parseInt(br.readLine())];
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("enter elements in an array");
			a[i]=Integer.parseInt(br.readLine());			
		}
			for (int i = 0; i < a.length; i++) {
				int j = a[i];
				if (j%3==0) {
					System.out.println(j);
				}
				
			}

	}

}
