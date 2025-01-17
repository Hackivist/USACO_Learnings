package com.usaco.palsquare;

/*
ID: karthik71
LANG: JAVA
TASK: palsquare
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class palsquare {


	public static String decimaltoNary(int n,int nary)
	{
		String digits="0123456789ABCDEFGHIJ";

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


		BufferedReader br = new BufferedReader(new FileReader("palsquare.in"));

		PrintWriter out = new PrintWriter(new FileWriter("palsquare.out"));

/*		BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.2/IO/palsquare/palsquare.in"));

		PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.2/IO/palsquare/palsquare.out"));
*/
		int n = Integer.parseInt(br.readLine());

		for(int i=1;i<=300;i++)
		{
			int sq = i*i;
			String str = decimaltoNary(sq,n);

			if(isPalindrome(str))
			{
				out.println(decimaltoNary(i,n)+" "+str);
			}

		}

		br.close();
		out.close();

	}

}
