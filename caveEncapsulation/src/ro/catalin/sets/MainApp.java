package ro.catalin.sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class MainApp
{

	public static void main(String[] args)
	{
		//set dow not keep duplicates
		//hash set does not retain order
		//	Set<String> set1=new HashSet<String>();

		//remember the order you added items in
		//		Set<String> set1=new LinkedHashSet<String>();


		//TreeSet sortes in natural order

		Set<String> set1 = new TreeSet<String>();
		if (set1.isEmpty())
		{
			System.out.println("set1 is empty at start");
		}
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		set1.add("mouse");
		if (set1.isEmpty())
		{
			System.out.println("set1 is empty at finish");
		}
		System.out.println(set1);

		//iteration

		for (String elements : set1)
		{
			System.out.println(elements);
		}


		//does set contain a given item?///
		if (set1.contains("adada"))
		{
			System.out.println("contains adada");
		}
		if (set1.contains("cat"))
		{
			System.out.println("contains cat");
		}
		
		//set1 contain some coomone elements woith set1 and some new
		
		//intersection
		Set<String> set2=new TreeSet<String>();
		if(set1.isEmpty()){
			System.out.println("set1 is empty at start");
		}
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		Set<String> intersection=new HashSet<>(set1);
		System.out.println(intersection);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		//difference
		
		Set<String> difference=new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
