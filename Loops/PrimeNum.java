import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args)
	{
		boolean prime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num :");
		int n=sc.nextInt();
		while(n>0)
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					prime=false;
					break;
				}
			}
		}
		if(prime==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}	
	}
}
	

		
		
			
