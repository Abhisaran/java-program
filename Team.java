import java.util.*;
public class Team {
	public static void main(String arg[])
	{
		int i,j,b=0,cnt=0;
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int m=sr.nextInt();
		int a[][]=new int[n+1][n+1];
		for(i=0;i<n;i++)
		{
			for(j=1;j<=n;j++)
			{
				a[i][j]=0;
			}
		}
		for(i=1;i<=n;i++)
		{
			for(j=0;j<n;j++)
			{
		//		System.out.print(a[i][j]+"\t");
			}
			//System.out.println("");
		}	
		for(i=1;i<=m;i++)
		{
			int k = sr.nextInt();
			int l=sr.nextInt();
			a[k][l]=1;
			//System.out.print(a[k][l]+"\t");
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				//System.out.print(a[i][j]+"\t");
				if(i!=j) {
				if(a[i][j]==1)
				{
					cnt=1;
				}}
			}
			//System.out.println("");
			b=b+cnt;
			cnt=0;
		}
		//System.out.println(b);
		if(b>=(n/2))
		{
			System.out.println("YES");
			
		}
		else
		{
			System.out.println("NO");
		}
	}
}