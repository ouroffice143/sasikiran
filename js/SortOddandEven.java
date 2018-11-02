package com.reg.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortOddandEven 
{
	 static void twoWaySort(int arr[], int n) 
	 { 
	        // Make all odd numbers negative 
	        for (int i=0 ; i<n ; i++) 
	            if ((arr[i] & 1) == 0) // Check for odd 
	                arr[i] *= -1; 
	       
	        // Sort all numbers 
	        Arrays.sort(arr); 
	       
	     // Retaining original array 
	        for (int i=0 ; i<n ; i++) 
	            if ((arr[i] & 1) == 0) 
	                arr[i] *= -1; 
	    } 
	      
	    // Driver Method 
	    public static void main(String[] args) throws NumberFormatException, IOException 
	    { 	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	System.out.println("how many numbers you want to enter?: ");
			int arr[]=new int[Integer.parseInt(br.readLine())];

			for (int i = 0; i < arr.length; i++)
			{
				System.out.println("enter elements in an array");
				arr[i]=Integer.parseInt(br.readLine());			
			}
	          
	        twoWaySort(arr, arr.length); 
	          
	        System.out.println(Arrays.toString(arr)); 
	    } 
}
