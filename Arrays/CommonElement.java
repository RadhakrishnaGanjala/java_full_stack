import java.util.Scanner;
class CommonElement
{
	public static void main(String[] args)
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[10];
		System.out.println("Enter Array sizes :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements for 1:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter "+n+" elements for 2:");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					c[count]=a[i];
					count++;
				}
			}
		}
		for(int i=0;i<=count;i++)
		{
			System.out.println(c[i]);
		}
	}
}
			
			
			
			
			
			
			
	/*	}
		for(int i=0;i<count;i++)
		{
			System.out.println(dup[i]);
		}
	}
}
				*/
		