package multiple.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import multiple.exceptio.Test;

public class AppMain
{

	public static void main(String[] args) 	{
			Test test=new Test();
			/*
				try
				{
					test.run();
				}
				catch (IOException e)
				{	
					
				}
				catch (ParseException e)
				{
					System.out.println("Couldn't parse command file.");
				}
				*/
			/*
			try
			{
				test.run();
			}
			catch (IOException | ParseException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	*/
			try
			{
				test.run();
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try
			{
				test.input();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
