import java.util.Scanner;
class RemovingEle
{
	public static void main(String[] args)
	{
		int n,r,count=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		System.out.println("Enter Array sizes :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements for 1:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to remove :");
		r=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]!=r)
			{
				b[count]=a[i];
				count++;
			}
		}
		System.out.println("after removal : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
}