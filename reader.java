import java.util.*;
import java.lang.*;
public class reader
{
	public int insert_reader(int r)
	{
		r++;
		return r;
	}
	public int insert_writter(int w)
	{
		w++;
		return w;
	}
	public int remove_reader(int r)
	{
		r--;
		return r;
	}
	public int remove_writter(int w)
	{
		w--;
		return w;	
	}
	public static void main(String args[])
	{
		reader ob=new reader();
		Scanner sc=new Scanner(System.in);
		int r=0,w=0;
		int ch;
		while(true)
		{
			System.out.println("Press\n1.INSERT READER\n2.INSERT WRITTER\n3.REMOVE READER\n4.REMOVE WRITTER\n5.EXIT\n");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:if(w==0)
					{
						r=ob.insert_reader(r);
						System.out.println("Current readers are"+r);
					}	
					else
					{
						System.out.println("Writter already present!!!!!Cant enter the critical section");
					}
					//System.out.println("CURRENT READERS ARE+",r);
					break;
				case 2:if(r==0 && w==0)
					{
						w=ob.insert_writter(w);
						System.out.println("Current writters are"+w);
					}
					else
						System.out.println("reader or writter already present");
					break;
				case 3: if(r==0)
					{
					System.out.println("Already no reader present\n");
					}
					else
					{
						r=ob.remove_reader(r);
						System.out.println("Availabel readers are"+r);
					}	
					break;
				case 4:if(w==0)
					{
					System.out.println("Already no writter present\n");
					}
					else
					{
						r=ob.remove_writter(w);
						System.out.println("Available writters are"+w);
					}
					break;
				case 5:System.exit(0);
		}
		
	}
}
}