import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{
		int a,rem,temp=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		a = sc.nextInt();
		temp=a;
		while(temp>0)
		{
		rem=temp%10;
		sum=(rem*rem*rem)+sum;
		temp=temp/10;
		}
		if(sum == a)
		{
			System.out.println("Arm");
		}
		else{
			System.out.println("Not Arm");
		}

	}
}

		
