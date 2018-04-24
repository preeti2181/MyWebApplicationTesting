package com.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class Example01 
{

	public static void main(String[] args) 
	{
		List<String>a = new ArrayList<>();
		a.add("preeti");
		a.add("pankaj");
		a.add("anika");
		
		for(int k=0; k<a.size(); k++)
		{
			System.out.println(a.get(k));
		}

	}
}
