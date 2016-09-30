package com.usaco.combo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class combo {

	private static int[] jconfig;
	private static int[] mconfig;
	private static int max;
	
	public static int modArith(int n){
		return n+=max;
	}

	public static boolean checkValidJohnMaster(int[] arr,int n,int index) {

			
			int remj = (jconfig[index]-n) % max;
			int remm = (mconfig[index]-n) % max;
			
			if (remj < 0)
			{
			    remj += max;
			}
			
			if(remm < 0) {
				remm +=max;
			}
			
			if(remj<=2 || remm<=2)
			{
				return true;
			}

		return false;
	}

	public static boolean checkValid(int n,int index)
	{
		return checkValidJohnMaster(jconfig,n,index) || checkValidJohnMaster(mconfig,n,index);
	}


	public static void main(String[] args) throws IOException {

		/*		BufferedReader br = new BufferedReader(new FileReader("combo.in"));

		PrintWriter out = new PrintWriter(new FileWriter("combo.out"));
		 */
		BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.3/IO/combo/combo.in"));

		PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.3/IO/combo/combo.out"));

		int count=0;

		max = Integer.parseInt(br.readLine());

		String[] johnConfig = br.readLine().split(" ");
		jconfig = new int[johnConfig.length];
		String[] manuConfig = br.readLine().split(" ");
		mconfig = new int[manuConfig.length];
		for(int i=0;i<johnConfig.length&&i<manuConfig.length;i++)
		{
			jconfig[i] = Integer.parseInt(johnConfig[i]);
			mconfig[i] = Integer.parseInt(manuConfig[i]);
		}
	
		for(int i=1;i<max+1;i++)
		{
			for(int j=1;j<max+1;j++)
			{

				for(int k=1;k<max+1;k++)
				{
					if(checkValid(i,0)&&checkValid(j,1)&&checkValid(k,2))
					{
						System.out.println(i+" "+j+" "+k);
						count++;
					}
				}
			}
		}

		out.println(count);

		out.close();
		br.close();


	}

}
