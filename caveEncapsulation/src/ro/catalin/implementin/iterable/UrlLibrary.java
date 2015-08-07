package ro.catalin.implementin.iterable;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>
{
	private LinkedList<String> urls=new LinkedList<String>();
	private class UrlIterator implements Iterator<String>{
		private int index=0;
		@Override
		public boolean hasNext()
		{
			return index<urls.size();
		}

		@Override
		public String next()
		{
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void remove(){
			urls.remove(index);
		}
	}
	public UrlLibrary(){
		urls.add("www.google.com");
		urls.add("www.facebook.com");
		urls.add("www.tontdaasdafa.com");
	}
	@Override
	public Iterator<String> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*

	@Override
	public Iterator<String> iterator()
	{
		return urls.iterator();
		
	
	}*/
	
	

}
