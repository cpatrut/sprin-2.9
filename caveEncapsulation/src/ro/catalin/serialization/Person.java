package ro.catalin.serialization;

import java.io.Serializable;

/**
 * @author Optaros
 *
 */
public class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 10314039677063685L;
	private int id;
	private String name;
	
	/**
	 * @param id
	 * @param name
	 */
	public Person(int id,String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
