import java .util.Scanner;
class SwitchCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender (M/F) :");
		char gender =sc.next().charAt(0);
		switch(gender)
		{
			case 'M' :
				System.out.println("Male");
				break;
			case 'F' :
				System.out.println("Female");
				break;
			default :
				System.out.println("Enter Valid gender(M/F)");
				break;
		}
	}
}
