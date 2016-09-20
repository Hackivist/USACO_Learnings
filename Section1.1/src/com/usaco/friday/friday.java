package com.usaco.friday;

/*
ID: karthik71
LANG: JAVA
TASK: friday
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class friday {

	static int[] days13Freq = new int[7];

	public static boolean isLeapYear(int year)
	{
		if((year%400==0)||(year%4==0&&year%100!=0))
		{
			return true;
		}
		return false;
	}

	public static int getRemainingDays(int year,int month)
	{
		if(month == 2)
		{
			if(isLeapYear(year))
			{
				return 29-13;
			}
			else
			{
				return 28-13;
			}
		}
		else
		{
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				return 31-13;
			}
			else if(month==4||month==6||month==9||month==11)
			{
				return 30-13;
			}
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.1/IO/friday/friday.in"));

		PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.1/IO/friday/friday.out"));

/*		BufferedReader br = new BufferedReader(new FileReader("friday.in"));

		PrintWriter out = new PrintWriter(new FileWriter("friday.out"));*/
		 
		int year = (Integer.parseInt(br.readLine()))+1900;
		
		int startingDay = 2;

		int day = startingDay;

		int prevMonth = 0;
		int currentMonth = 0;



		for(int i=1900;i<year;i++)
		{
			day+=12%7;
			day%=7;

			days13Freq[day]+=1;
			
			int m;

			for(m=2;m<13;m++)
			{
				prevMonth = getRemainingDays(i, m-1);
				day+=(prevMonth+13)%7;
				day%=7;
				days13Freq[day]+=1;
			}
			

			if(isLeapYear(i))
			{
				startingDay+=(366%7);
				startingDay%=7;
				day=startingDay;
			}
			else
			{
				startingDay+=(365%7);
				startingDay%=7;
				day=startingDay;
			}
			
		}
		
		out.write(days13Freq[0]+" ");
		out.write(days13Freq[1]+" ");
		out.write(days13Freq[2]+" ");
		out.write(days13Freq[3]+" ");
		out.write(days13Freq[4]+" ");
		out.write(days13Freq[5]+" ");
		out.write(days13Freq[6]+"\n");
		
		br.close();
		out.close();
	}

}
