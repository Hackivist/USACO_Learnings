package com.usaco.milk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

class farmer implements Comparable<farmer>{

	private int capacity;
	private int price;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	farmer(int capacity,int price)
	{
		this.price = price;
		this.capacity = capacity;
	}

	@Override
	public int compareTo(farmer obj) {
		
		if(this.price>obj.price)
		{
			return 1;
		}
		else if(this.price<obj.price)
		{
			return -1;
		}
		return 0;
	}
}

public class milk {

	public static void main(String[] args) throws IOException {


		/*		BufferedReader br = new BufferedReader(new FileReader("milk2.in"));

	PrintWriter out = new PrintWriter(new FileWriter("milk2.out"));*/

		BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.3/IO/milk/milk.in"));

		PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.3/IO/milk/milk.out"));

		String[] req = br.readLine().split(" ");

		int n = Integer.parseInt(req[0]);

		int m = Integer.parseInt(req[1]);
		
		int sum = 0;
		
		farmer[] farmers = new farmer[m];

		for(int i=0;i<m;i++)
		{
			String[] farm = br.readLine().split(" ");
			farmers[i]=new farmer(Integer.parseInt(farm[0]),Integer.parseInt(farm[1]));
		}
		
		Arrays.sort(farmers);
		
		for(int i=0;i<m;i++)
		{
			if(n==0)
			{
				break;
			}
			
			
			
		}
		
		out.println(sum);
		
		br.close();
		out.close();
		
	}

}