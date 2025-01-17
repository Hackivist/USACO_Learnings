package com.usaco.namenum;

/*
ID: karthik71
LANG: JAVA
TASK: namenum
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class namenum {

	private static String[] dict;

	static String res = null;

	public static int binarysearch(String[] arr,String key)
	{
		int left =0, right = arr.length-1;

		while(left<=right)
		{
			int m = left + (right-left)/2;

			if(arr[m].equals(key))
			{
				return m;
			}

			if(arr[m].compareTo(key)<0)
			{
				left=m+1;
			}
			else
			{
				right=m-1;
			}
		}
		return -1;

	}

	public static char[] getCharSet(char n)
	{

		if(n=='2')
		{
			return new char[] {'A','B','C'};
		}
		else if(n=='3')
		{
			return new char[] {'D','E','F'};
		}
		else if(n=='4')
		{
			return new char[] {'G','H','I'};
		}
		else if(n=='5')
		{
			return new char[] {'J','K','L'};
		}
		else if(n=='6')
		{
			return new char[] {'M','N','O'};
		}
		else if(n=='7')
		{
			return new char[] {'P','R','S'};
		}
		else if(n=='8')
		{
			return new char[] {'T','U','V'};
		}
		else if(n=='9')
		{
			return new char[] {'W','X','Y'};
		}
		return null;
	}

	public static void getNameNum(String input,String name,int index,int len,PrintWriter out)
	{
		if(name.length()==len){

			int result = binarysearch(dict, name);

			if(result!=-1)
			{
				res=name;
				out.println(res);
			}
			return;
		}

		char[] charset=getCharSet(input.charAt(index));

		for(int i=0;i<charset.length;i++)
		{
			getNameNum(input, name+Character.toString(charset[i]),index+1, len,out);

		}
	}

	public static void main(String[] args) throws IOException {

/*		
		BufferedReader br = new BufferedReader(new FileReader("namenum.in"));
		PrintWriter out = new PrintWriter(new FileWriter("namenum.out"));
		BufferedReader brdict = new BufferedReader(new FileReader("dict.txt"));*/
		
		

		BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.2/IO/namenum/namenum.in"));

		BufferedReader brdict = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.2/IO/namenum/dict.txt"));

		PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.2/IO/namenum/namenum.out"));

		String input = br.readLine(); //Input number

		int len = input.length(); //length of the word

		List<String> list = new ArrayList<String>(); //To extract all words from dict.txt

		String temp;

		while((temp=brdict.readLine())!=null)
		{
			list.add(temp);
		}

		dict = list.toArray(new String[list.size()]); //Converting back to array for binary search
		
		getNameNum(input,"",0, len,out);
		
		if(res ==null)
		{
			out.println("NONE");
		}

		br.close();
		out.close();

	}

}
