package wildcardsandGenercs;

import java.util.ArrayList;

class Machine{
	@Override
	public String toString(){
		return "this is sparta";
	}
	
	public void start(){
		System.out.println("machine started");
	}
}
class Camera extends Machine{
	
	@Override
	public String toString(){
		return "this is sparta's camera";
	}
	public void snap()
	{
		System.out.println("snap");
	}
	
}
public class AppMain
{
	public static void main(String[]args){
	ArrayList<Machine> list=new ArrayList<Machine>();
	list.add(new Machine());
	list.add(new Machine());
	showList(list);
	
	
	ArrayList<Camera> list2=new ArrayList<Camera>();
	list2.add(new Camera());
	list2.add(new Camera());
	showList(list2);
	showList2(list2);
	showList2(list);
	}
	
	public static void showList(ArrayList<? extends Machine> list){
		for(Machine value:list){
			System.out.println(value);
			value.start();
			
		}
	}
		
		public static void showList2(ArrayList<? super Camera> list){
			for(Object value:list){
				System.out.println(value);
				
			}
		
	}
}
