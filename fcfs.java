import java.util.Scanner;
public class fcfs
{
	public static void main(String args[])
	{
	int n,temp,i,j;
	//int p;
	//System.out.println("enter the no. of processors\n");
	//p=sc.nextInt();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no. of process\n");
	n=sc.nextInt();
	int pno[]=new int[n];
	int arr[]=new int[n];
	for(i=0;i<n;i++)
	{
		pno[i]=i+1;
	}
	for(i=0;i<n;i++)
	{
		System.out.println("enter arrival time for process "+i);
		arr[i]=sc.nextInt();
	}
	int bur[]=new int[n];
	for(i=0;i<n;i++)
	{
		System.out.println("enter burst time for process "+i);
		bur[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				temp=bur[i];
				bur[i]=bur[j];
				bur[j]=temp;

				temp=pno[i];
				pno[i]=pno[j];
				pno[j]=temp;

			}	
		}
	}
	
	//for(i=0;i<n;i++)
	//{
	//	System.out.println(pno[i]);
	//}
	int wt[]=new int[n];
	int ta[]=new int[n];
	int ct[]=new int[n];
	ct[0]=bur[0];
	for(i=1;i<n;i++)
	{
		ct[i]=ct[i-1]+bur[i];
	System.out.println("completion time"+ct[i]);
	}

	for(i=0;i<n;i++)
	{	
		ta[i]=ct[i]-arr[i];
		
	}
	for(i=0;i<n;i++)
	{
		wt[i]=ct[i]-bur[i]-arr[i];
		if(wt[i]<0)
		{
			wt[i]=0;
		}
	}
	for(i=0;i<n;i++)
	{
		System.out.println("turnaround  time for process is "+ta[i]);
	}
	for(i=0;i<n;i++)
	{
		System.out.println("waiting time for process is "+wt[i]);
	}
	float sum1=0,sum2=0;
	for(i=0;i<n;i++)
	{
		sum1=sum1+wt[i];
		sum2=sum2+ta[i];
	}
	
	System.out.println("Average waiting time="+sum1/n);
	
	System.out.println("Average turnaround time="+sum2/n);
}
}			
			
	
	
	
		
	