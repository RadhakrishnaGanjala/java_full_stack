import java.util.Scanner;
class Search
{
	public static void main(String[] args)
	{
		int n,se,flag=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter Array size :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Searh element :");
		se=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==se)
			{
				System.out.println("Found at "+ i);
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Not found");
		}
		
	}
}