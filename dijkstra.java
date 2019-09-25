import java.util.Scanner;
public class dijkstra
{
	public static void main(String args[])
	{
	int n,j=0;
	System.out.println("enter no of nodes\n");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int adj[][]=new int[n][n];
	int visited[]=new int[n];
	int i,count=0;
	System.out.println("Enter adjacency matrix\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			adj[i][j]=sc.nextInt();
		}
	}
	int distance[]=new int[n];
	System.out.println("Enter start node\n");
	int u;
	u=sc.nextInt();
	int cost[][]=new int[n][n];
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(adj[i][j]==0)
			{
				cost[i][j]=9999;
			}
			else
			{
				cost[i][j]=adj[i][j];
			}
		}
	}
	int pred[]=new int[n];
	for(i=0;i<n;i++)
	{
		visited[i]=0;
	//	pred[i]=u;
		distance[i]=cost[u][i];
	}
	distance[u]=0;
	count=1;
	visited[u]=1;
	//int  min=9999;
	int nextnode=0;
	while(count<n-1)
	{
		int min=9999;
		for(i=0;i<n;i++)
		{
			if(distance[i]<min && visited[i]==0)
			{
				min=distance[i];
				nextnode=i;
			}
		}
		visited[nextnode]=1;
		for(i=0;i<n;i++)
		{
			if(visited[i]==0)
			{
				if(min+cost[nextnode][i]<distance[i])
				{
					distance[i]=min+cost[nextnode][i];
				}
			}
		}
		count++;
	}	
	for(i=0;i<n;i++)
	{
		if(i!=u)
		{
			System.out.println("distance of node is"+distance[i]);
		}
	}
}
}

		