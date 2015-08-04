package inner.classes;

public class Robot
{
	private int id;

	public class Brain
	{
		public void think()
		{
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	static class Batter{
		public void charge(){
			System.out.println("Battery Charging");
		}
	}
	public Robot()
	{

	}

	public Robot(int id)
	{
		this.id = id;
	}

	public void start()
	{
		System.out.println("Starting roboto: " + id);
		Brain brain = new Brain();
		brain.think();
		
		final String name="Robert";
		
		final class Temp{
			public void doS(){
				System.out.println("id is:"+id);
				System.out.println("My name is"+name);
			}
		}
		Temp temp=new Temp();
		temp.doS();
	}
}
