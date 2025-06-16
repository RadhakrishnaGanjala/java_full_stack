import java.util.Scanner;
class EqualOrNot
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a==b)
		{
			System.out.println("Yes,Given two numbers are equal");
		}
		else
		{
			System.out.println("No,Given two numbers are not equal");
		}
	}
}
