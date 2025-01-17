package com.usaco.transform;
/*
ID: karthik71
LANG: JAVA
TASK: transform
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class transform {
	
	char[][] board1;
	char[][] board2;
	
	
	public boolean checkFor90(char[][] board1,char[][] board2)
	{
		
		for(int i=0;i<board1.length;i++)
		{
			for(int j=0;j<board1.length;j++)
			{
				if(board1[i][j]!=board2[j][board1.length-1-i])
				{
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean checkFor180(char[][] board1,char[][] board2)
	{
		
		for(int i=0;i<board1.length;i++)
		{
			for(int j=0;j<board1.length;j++)
			{
				if(board1[i][j]!=board2[board1.length-1-i][board1.length-1-j])
				{
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean checkFor270(char[][] board1,char[][] board2)
	{
		
		for(int i=0;i<board1.length;i++)
		{
			for(int j=0;j<board1.length;j++)
			{
				if(board1[i][j]!=board2[board1.length-1-j][i])
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public char[][] reflect(char board2[][])
	{
		char[][] result = new char[board2.length][board2.length];
		
		for(int i=0;i<board2.length;i++)
		{
			for(int j=0;j<board2.length;j++)
			{
				result[i][j]=board2[i][board2.length-1-j];
			}
		}
		
		return result;
	}
	
	public boolean checkForEquality(char[][] board1,char[][] board2)
	{
		
		for(int i=0;i<board1.length;i++)
		{
			for(int j=0;j<board1.length;j++)
			{
				if(board1[i][j]!=board2[i][j])
				{
					
					return false;
				}
			}
		}
		
		return true;
	}
	

	public static void main(String[] args) throws IOException {
		
		
	BufferedReader br = new BufferedReader(new FileReader("transform.in"));

	PrintWriter out = new PrintWriter(new FileWriter("transform.out"));
	
/*	BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.2/IO/transform/transform.in"));

	PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.2/IO/transform/transform.out"));	*/
	
	transform obj = new transform();
	
	int n = Integer.parseInt(br.readLine());
	
	obj.board1 = new char[n][n];
	
	obj.board2 = new char[n][n];
	
	for(int i=0;i<n;i++)
	{
		String line = br.readLine();
		
		char[] temp= line.toCharArray();
		
		for(int j=0;j<n;j++)
		{
			obj.board1[i][j]=temp[j];
		}
	}
	
	for(int i=0;i<n;i++)
	{
		String line = br.readLine();
		
		char[] temp= line.toCharArray();
		
		for(int j=0;j<n;j++)
		{
			obj.board2[i][j]=temp[j];
		}
	}
	
	if(obj.checkFor90(obj.board1, obj.board2))
	{
		out.println(1);
	}
	else if(obj.checkFor180(obj.board1, obj.board2))
	{
		out.println(2);
	}
	else if(obj.checkFor270(obj.board1, obj.board2))
	{
		out.println(3);
	}
	else if(obj.checkForEquality(obj.board1, obj.reflect(obj.board2)))
	{
		out.println(4);
	}
	else if((obj.checkFor90(obj.board1, obj.reflect(obj.board2)))||(obj.checkFor180(obj.board1, obj.reflect(obj.board2)))||(obj.checkFor270(obj.board1, obj.reflect(obj.board2))))
	{
		out.println(5);
	}
	else if(obj.checkForEquality(obj.board1, obj.board2))
	{
		out.println(6);
	}
	else
	{
		out.println(7);
	}
	
	br.close();
	out.close();
	
	}
}
