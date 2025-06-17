import java.util.Scanner;
class LargestNum
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a,b and c :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater "+b);
		}
		else if(a==b || a==c || b==c)
		{
			System.out.println("Enter different different numbers");
		}
		else{
			System.out.println("c is greater "+c);
			
		}
	}
}
			
		
		
		