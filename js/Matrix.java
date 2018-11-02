package com.reg.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Matrix 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter what area you want: add, mul?");
		int ch =sc.nextInt();
		//char areas = (char)areas1;*/
		switch (ch) 
		{
		case 1:
		{
			int i,j;
			System.out.println("enter no. of rows");
			String s1 = br.readLine();
			int r = Integer.parseInt(s1);
			
			System.out.println("enter no. of columns");
			String s2 = br.readLine();
			int c = Integer.parseInt(s2);
			
			int a[][] = new int[r][c];
			int b[][] = new int[r][c];
			int x[][] = new int[r][c];
			
			System.out.println("enter 1st matrix numbers : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j] = Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("enter 2nd matrix numbers : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					b[i][j] = Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("addition of two matrix numbers is : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.println(a[i][j]+b[i][j]+"\t");
				}
			}
			System.out.println();
		}

		default:
		{

			int i,j,k;
			System.out.println("enter no. of rows");
			String s1 = br.readLine();
			int r = Integer.parseInt(s1);
			
			System.out.println("enter no. of columns");
			String s2 = br.readLine();
			int c = Integer.parseInt(s2);
			
			int a[][] = new int[r][c];
			int b[][] = new int[r][c];
			int x[][] = new int[r][c];
			
			System.out.println("enter 1st matrix numbers : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j] = Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("enter 2nd matrix numbers : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					b[i][j] = Integer.parseInt(br.readLine());
				}
			}
			
			System.out.println("mul of two matrix numbers is : ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					for(k=0;k<r;k++)
					{
						x[i][j] = x[i][j]+(a[i][k]*b[k][j]);
					}
				}
			}
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
					System.out.println(" "+x[i][j]);
			}
			System.out.println();   
		}
		}
	}
}
