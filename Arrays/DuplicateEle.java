import java.util.Scanner;
class DuplicateEle
{
	public static void main(String[] args)
	{
		int n,count=0,s;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int dup[]=new int[10];
		System.out.println("Enter Array size :");
		n=sc.nextInt();
		System.out.println("Enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			s=a[i];
			for(int j=i+1;j<n;j++)
			{
				if(s==a[j])
				{
					
						dup[count]=s;
						count+=1;	
					
				}
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(dup[i]);
		}
	}
}
				
		