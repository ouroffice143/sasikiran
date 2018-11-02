package com.reg.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Areas 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		System.out.println("enter what area you want: triangle, area?");
		int ch =sc.nextInt();
		//char areas = (char)areas1;*/
		switch (ch) {
		case 1:
		{
			System.out.println("Enter the width of the Triangle:");
			int width =Integer.parseInt(br.readLine());

			System.out.println("Enter the height of the Triangle:");
			int height =Integer.parseInt(br.readLine());

			int area = (width* height)/2;
			  System.out.println("Area of Triangle is: " + area);
			break;
		}

		default:
		{

	         System.out.println("Enter the radius:");
	         int radius=Integer.parseInt(br.readLine());
	         
	         int area=(int) (Math.PI*radius*radius);
	         int  area1= (22*radius*radius)/7;
	         System.out.println("area " + area);
	         System.out.println("area " + area1);
			break;
		}
			
		}
		
	}
}
