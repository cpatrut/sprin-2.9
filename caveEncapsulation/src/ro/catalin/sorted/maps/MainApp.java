package ro.catalin.sorted.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


class Temp
{

}

public class MainApp
{
	public static void main(String[] args)
	{
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		//		System.out.println(new Temp());
		testMap(treeMap);
	
	}

	public static void testMap(Map<Integer, String> map)
	{
		map.put(1, "one");
		map.put(3,"three");
		map.put(4,"for");
		map.put(2,"two");

		map.put(5,"five");
		map.put(6,"six");

		
		for(Integer key:map.keySet()){
			String value=map.get(key);
			System.out.println(key+":"+value);
			
		}
		for(Map.Entry<Integer, String> v:map.entrySet()){
			
		}
	}
}
