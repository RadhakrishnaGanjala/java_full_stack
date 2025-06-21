import java.util.Scanner;
class ReverseArray
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		System.out.println("Enter Array size :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=a[n-1-i];
		}
		System.out.println("Reversed array ");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+b[i]);
		}
	}
}