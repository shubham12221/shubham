import java.util.Scanner;
public class priority
{
	public static void main(String args[])
	{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no  of process\n");
	int i;
	n=sc.nextInt();
	int pid[]=new int[n];
	for(i=0;i<n;i++)
	{
		pid[i]=i+1;
	}
	int bur[]=new int[n];
	System.out.println("enter burst time of processes\n");
	for(i=0;i<n;i++)
	{
		bur[i]=sc.nextInt();
	}
	System.out.println("enter priority of each process\n");
	int pri[]=new int[n];
	for(i=0;i<n;i++)
	{
		pri[i]=sc.nextInt();
	}
	int temp=0,j;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(pri[i]>pri[j])
			{
				temp=pri[i];
				pri[i]=pri[j];
				pri[j]=temp;

				temp=pid[i];
				pid[i]=pid[j];
				pid[j]=temp;

				temp=bur[i];
				bur[i]=bur[j];
				bur[j]=temp;
			}
		}
	}
	int wt[]=new int[n];
	int ta[]=new int[n];
	int ct[]=new int[n];
	ct[0]=bur[0];
	for(i=1;i<n;i++)
	{
		ct[i]=ct[i-1]+bur[i];
	}
	for(i=0;i<n;i++)
	{
		ta[i]=ct[i];
	}
	for(i=0;i<n;i++)
	{
		wt[i]=ct[i]-bur[i];
		if(wt[i]<0)
		{
			wt[i]=0;
		}
	}
	int sum1=0,sum2=0;
	for(i=0;i<n;i++)
	{
		sum1+=ta[i];
		sum2+=wt[i];
	}
	System.out.println("average turnaround time will be "+sum1/n);
	
	System.out.println("average waiting time will be "+sum2/n);		
	}
}		