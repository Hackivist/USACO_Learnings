package com.usaco.transform;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class transform {

	public static void main(String[] args) throws IOException {
		
		
/*		BufferedReader br = new BufferedReader(new FileReader("milk2.in"));

	PrintWriter out = new PrintWriter(new FileWriter("milk2.out"));*/
	
	BufferedReader br = new BufferedReader(new FileReader("D:/USACO_Learnings/Section1.2/IO/transform/transform.in"));

	PrintWriter out = new PrintWriter(new FileWriter("D:/USACO_Learnings/Section1.2/IO/transform/transform.out"));	
	
	int n = Integer.parseInt(br.readLine());
	
	System.out.println(n);

	}

}