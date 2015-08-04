package ro.catalin.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainApp
{
	public static void main(String[] args){
		
		//Array list manage arrays internally
		//Linked
		ArrayList <Integer> arrayList=new ArrayList<Integer>();
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		doThimings("ArrayList", arrayList);
		doThimings("LinkedList", linkedList);
		
	}
	private static void doThimings(String type,List<Integer>list){
	

			for(int i=9;i<1E5;i++){
				list.add(i);
			}
			long start=System.currentTimeMillis();
				for(int i=0;i<1E5;i++){
					list.add(i);
				}
			
//			for(int i=0;i<1E5;i++){
//			list.add(0,i);
//			}
			long end=System.currentTimeMillis();
			
			System.out.println("Time taken:"+(end-start)+" ms for "+type);
			
	}
}
