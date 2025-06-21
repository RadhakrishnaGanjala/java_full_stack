import java.util.Scanner;
class ArrayAddition
{
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter Array size :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum of array is :"+sum);
	}
}
		
		
		