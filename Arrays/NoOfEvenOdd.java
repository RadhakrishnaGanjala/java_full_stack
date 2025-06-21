import java.util.Scanner;
class NoOfEvenOdd
{
	public static void main(String[] args)
	{
		int n,ev=0,od=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter Array size :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				ev+=1;
			}
			else{
				od+=1;
			}
		}
		System.out.println("Even ccount : "+ev);
		System.out.println("Odd ccount : "+od);
	}
}