package com.usaco.dualpal;
/*
ID: karthik71
LANG: JAVA
TASK: dualpal
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class dualpal {
	
	private static int sol=0;
	
	public static String decimaltoNary(int n,int nary)
	{
		String digits="0123456789";

		String result="";

		if(n<=0)
		{
			return "0";
		}

		while(n>0)
		{
			int digit=n%nary;
			result=digits.charAt(digit)+result;
			n/=nary;
		}

		return result;
	}
	
	public static boolean isPalindrome(String str)
	{

		
		int len = str.length();

		for(int i=0;i<len;i++)
		{
			
			if(str.charAt(i)!=str.charAt(len-1-i))
			{
				return false;
			}
			
		}
		return true;
	}
	

	public static void main(String[] args) throws IOException {
		
		
/*		BufferedReader br = new BufferedReader(new FileReader("dualpal.in"));

		PrintWriter out = new PrintWriter(new FileWriter("dualpal.out"));*/
		

		BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.2/IO/dualpal/dualpal.in"));

		PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.2/IO/dualpal/dualpal.out"));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		for(int i=start+1;sol<n;i++)
		{
			int palnum=0;
			
			for(int j=2;j<11;j++)
			{
				if(isPalindrome(decimaltoNary(i,j)))
				{
					palnum++;
				}
				if(palnum==2)
				{
					out.println(i);
					sol++;
					break;
				}
			}
		}
		
		br.close();
		out.close();

	}

}
