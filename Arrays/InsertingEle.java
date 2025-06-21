import java.util.Scanner;
class InsertingEle
{
	public static void main(String[] args)
	{
		int n,pos,count=0;
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
		System.out.println("Enter index to insert: ");
		pos=sc.nextInt();
		System.out.println("Enter element to insert: ");
		int el=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(pos==i)
			{
				