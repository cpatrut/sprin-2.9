package ro.catalin;
class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception
	{
			System.out.println("closing");
	}
	
}
public class AppMain
{

	public static void main(String[] args)
	{
		try(Temp temp2=new Temp()){
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
