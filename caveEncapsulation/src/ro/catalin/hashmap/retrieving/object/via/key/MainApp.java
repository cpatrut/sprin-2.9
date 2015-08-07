package ro.catalin.hashmap.retrieving.object.via.key;

import java.util.HashMap;
import java.util.Map;


public class MainApp
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		
		String text=map.get(8);
		System.out.println(text);
		
		for(Map.Entry<Integer,String> entry:map.entrySet()){
			int key=entry.getKey();
			String value=entry.getValue();
			
			System.out.println(key+":"+value);
		}
		
	}
}
