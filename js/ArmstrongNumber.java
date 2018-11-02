package com.reg.js;


import java.io.IOException;

import java.util.Scanner;


public class ArmstrongNumber {
	public static void main(String args[]){

	Scanner s=new Scanner(System.in);
	System.out.println("enter a number to check amstrong num  are not");
	
	String n=s.nextLine();
	int l=n.length();
   String sp[]=n.split("");
   int k;
   int c=0;

   for(int j=0;j<n.length();j++) {
       k=Integer.parseInt(sp[j]);
       k=(int) Math.pow(k, l); 
       c=k+c;
             }
   int k1=Integer.parseInt(n);

       if(c==k1) {
    	   System.out.println(k1+"is amstring num");
       }else {
	   System.out.println(k1+"is notamstring num");
       }
	}
}