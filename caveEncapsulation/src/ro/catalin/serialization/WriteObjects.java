package ro.catalin.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class WriteObjects
{

	public static void main(String[] args)
	{
		System.out.println("Writing objects..");
		Person [] people={new Person(1,"Sue"),new Person(2,"Mike"),new Person(3,"dsadads")};
		ArrayList<Person> peopleList=new ArrayList<Person>(Arrays.asList(people));
		Person mike = new Person(543, "Mike");
		Person sue = new Person(123, "Sue");

		

		try (FileOutputStream fs = new FileOutputStream("people.bin"))
		{
				ObjectOutputStream os=new ObjectOutputStream(fs);
				os.writeObject(people);
				os.writeObject(peopleList);
				os.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("we can not a file");
		}
		catch (IOException e)
		{
			System.out.println("IO exception");
			e.printStackTrace();
		}
		



	}

}
