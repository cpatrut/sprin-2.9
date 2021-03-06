package ro.catalin.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ReadObjects
{

	public static void main(String[] args)
	{
		System.out.println("Reading objects");
		try (FileInputStream fi = new FileInputStream("people.bin"))
		{
				ObjectInputStream os=new ObjectInputStream(fi);
				Person [] people=(Person[]) os.readObject();
				for(Person p:people){
					System.out.println(p);
				}
				@SuppressWarnings("unchecked")
				ArrayList<Person> peopleList=(ArrayList<Person>)os.readObject();
				for(Person p:peopleList){
					System.out.println(p);
				}
				os.close();
				
		}

		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
