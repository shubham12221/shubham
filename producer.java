import java.util.*;
import java.lang.*;
public class producer
{
	
	
	public static int producer(int buffer_size,int n)
	{
		if(buffer_size==n)
		{
			System.out.println("BUFFER IS ALREADY FULL...YOU CANT PRODUCE");
		}
		else
		{
			buffer_size++;
		}	
		return buffer_size;	
	}
	public static int consumer(int buffer_size,int n)
	{
		if(buffer_size==0)
		{
			System.out.println("BUFFER IS EMPTY....YOU CANT CONSUME");
		}
		else
		{
			buffer_size--;
		}
		return buffer_size;
	}
	public static void main(String args[])
	{
	producer ob=new producer();
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter buffer size\n");
	n=sc.nextInt();
	int buffer_size=0;
	while(true)
	{
		int ch;
		System.out.println("PRESS 1. FOR PRODUCING\n 2. FOR CONSUMING\n 4.EXIT\n");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: buffer_size=ob.producer(buffer_size,n);
				System.out.println("Current size of buffer is "+buffer_size);
				System.out.println();
				break;
			case 2: buffer_size=ob.consumer(buffer_size,n);
				System.out.println("Current size of buffer is "+buffer_size);
				System.out.println();
				break;
			//case 3: display();
			case 4: System.exit(0);
		}
	}
	}
}