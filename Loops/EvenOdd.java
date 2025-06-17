import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		i=sc.nextInt();
		if(i % 2==0)
		{
			System.out.println("Even "+i);
		}
		else{
			System.out.println("odd "+i);
		}
	}
}
		