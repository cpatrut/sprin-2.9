package ro.catalin.queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class MainApp
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		q1.add(10);
		q1.add(20);
		q1.add(30);
		System.out.println("head of queue is:" + q1.element());
		try
		{
			q1.add(40);
		}
		catch (IllegalStateException e)
		{
			System.out.println("dsaad");
		}
		for (Integer val : q1)
		{
			System.out.println("Queue value:" + val);
		}
		Integer value = q1.remove();
		System.out.println("Removed from queue:" + value);
		System.out.println("Removed from queue:" + q1.remove());
		System.out.println("Removed from queue:" + q1.remove());
		try
		{
			System.out.println("Removed from queue:" + q1.remove());
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Tried to remove to many items from queue");
		}
		///////////////////////////////////////////////
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		for(Integer val:q2){
			System.out.println("Queue vaalue:"+value);
		}

	}

}
