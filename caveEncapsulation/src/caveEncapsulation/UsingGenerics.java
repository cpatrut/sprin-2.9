package caveEncapsulation;

import java.util.ArrayList;
import java.util.HashMap;
class Animal{
	
}
public class UsingGenerics
{
	public static void main(String[] args){
		
		
		//before java 5
		ArrayList list=new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit=(String)list.get(1);
		
		System.out.println(fruit);
				
		
		//modern style
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("cat");
		list2.add("dog");
		list2.add("aligator");
		
		String animal=list2.get(1);
		System.out.println(animal);
		
		
		//there can be more than one type argument
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		//java 7 style
		
		ArrayList<Animal> someList=new ArrayList<>();
		
	}
}
