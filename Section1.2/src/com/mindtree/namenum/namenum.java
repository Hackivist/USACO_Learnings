package com.mindtree.namenum;
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

	public static void main(String[] args) throws IOException {

		/*		BufferedReader br = new BufferedReader(new FileReader("namenum.in"));

		PrintWriter out = new PrintWriter(new FileWriter("namenum.out"));*/

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
		
		String[] dict = list.toArray(new String[list.size()]); //Converting back to array for binary search
		
	}

}
