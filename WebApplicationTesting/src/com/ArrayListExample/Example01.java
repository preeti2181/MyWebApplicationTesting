package com.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class Example01 {

	public static void main(String[] args) 
	{
		/*int a=10;
		a=20;
		System.out.println(a);*/
		
		
		List<String>a=new ArrayList<>();
		a.add("Selenium");
		a.add("LoadRunner");
		a.add("QTP");
		a.add("Jmeter");
		
		for(int k=0;k<a.size();k++)
		{
		System.out.println(a.get(k));
		
		}
		
		

	}
	

}
