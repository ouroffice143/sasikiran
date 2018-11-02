package com.reg.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternNumber 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter number of rows you want: ");
	int n = Integer.parseInt(br.readLine());
	
	 for (int i = 1; i <= n; i++)
     {
         for (int j = n; j > i; j--)
         {
             System.out.print(" ");
         }

         for (int k = 1; k <= i; k++)
         {
             System.out.print(i + " ");
         }
         System.out.println();
        
     }
	
	}

}
