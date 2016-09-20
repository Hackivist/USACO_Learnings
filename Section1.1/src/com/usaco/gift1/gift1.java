package com.usaco.gift1;
/*
ID: karthik71
LANG: JAVA
TASK: gift1
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class gift1 {
	
	static LinkedHashMap<String, Integer> friends= new LinkedHashMap<String, Integer>();
	
	static int[] friendsGift;
	
	
	public static void createFriend(int index, String name)
	{
		friends.put(name,index);
	}

	public static void main(String[] args) throws IOException {
		
		
	
		BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.1/IO/gift1/gift1.in"));
		
		PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.1/IO/gift1/gift1.out"));
		
/*		BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
		
		PrintWriter out = new PrintWriter(new FileWriter("gift1.out"));
*/		
		int noOfFriends = Integer.parseInt(br.readLine());
		
		
		friendsGift = new int[noOfFriends];
		
		for(int i=0;i<noOfFriends;i++)
		{
			String name = br.readLine();
			createFriend(i,name);
		}
		
		for(int i=0;i<noOfFriends;i++)
		{
			String name = br.readLine();
			
			StringTokenizer stok = new StringTokenizer(br.readLine(), " ");
			
			
			int amount = Integer.parseInt(stok.nextToken());
			int persons = Integer.parseInt(stok.nextToken());
			
			if(persons>0)
			{
					int share = amount/persons;
					
					for(int j=0;j<persons;j++)
					{
						String frnd = br.readLine();
						friendsGift[friends.get(frnd)]+=share;
						friendsGift[friends.get(name)]-=share;
					}
					
			}
			else
			{
				friendsGift[friends.get(name)]+=amount;
			}
		}
		
		for(Map.Entry<String, Integer> entry: friends.entrySet())
		{
			out.write(entry.getKey()+" "+friendsGift[entry.getValue()]+"\n");
		}
		
		br.close();
		out.close();
	}
}
