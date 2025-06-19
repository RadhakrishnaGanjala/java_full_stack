import java.util.Scanner;
class MinMax
{
	public static void main(String[] args)
	{
		int n,min=0,max=0,newmin=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter Array size :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(min<a[i])
			{
				newmin=min;
			}
			else{
				newmin=a[i];
			}
		}
		System.out.println(newmin);
	}
}