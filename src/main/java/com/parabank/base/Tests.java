package com.parabank.base;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Tests
{
	public static void frequencyCount(String s) 
	{
		Map<Character,Integer> map = new LinkedHashMap<>();
		char[] arr=s.toCharArray();
		for(Character ch : arr)
		{
			Integer count = map.get(ch);
			if(count==null) 
			{
				map.put(ch, 1);
			}
			else 
			{
				map.put(ch, ++count);
			}
		}
		
		Set<Entry<Character,Integer>> set =map.entrySet();
		for(Entry<Character,Integer> entry:set)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}	
	}
	public static void main(String[] args)
	{
		String s = "abcdabcdabcd";
		frequencyCount(s);
	}
}
