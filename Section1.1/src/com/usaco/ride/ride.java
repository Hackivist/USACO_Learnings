package com.usaco.ride;
/*
ID: karthik71
LANG: JAVA
TASK: ride
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ride {
	
	
	public static int getCode(String str)
	{
		
		int result = 1;
		char[] nameArray = str.toCharArray();
		
		for(char c: nameArray)
		{
			result*=(c-64);
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		
		//BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.1/IO/ride/ride.in"));
		BufferedReader br = new BufferedReader(new FileReader("ride.in"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:/USACO_Learnings/Section1.1/IO/ride/ride.out")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		
		String name = br.readLine();
		String group = br.readLine();
		
		if((getCode(name)%47)==(getCode(group)%47))
		{
			out.println("GO");
		}
		else
		{
			out.println("STAY");
		}
	
		out.close();
		System.exit(0);
		//br.close();
	}

}
