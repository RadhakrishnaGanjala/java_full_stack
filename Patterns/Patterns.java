class Patterns
{
	public static void main(String[] args)
	{
		//for(int i=0;i<6;i++)
		//{
		//	for(int j=0;j<6;j++)						//1 Solid square
		//	{
		//		System.out.print(" * ");
		//	}
		//	System.out.println();
		//}

		
		//for(int a=1;a<6;a++)
		//{
		//	for(int b=0;b<5;b++)
		//	{
		//		System.out.print(a);					//2 11111 square
		//	}
		//	System.out.println();
		//}		

		
		//for(int c=1;c<6;c++)
		//{
		//	for(int d=1;d<6;d++)
		//	{
		//		System.out.print(d);					//3   12345 square
		//	}
		//	System.out.println();
		//}


		
		//int temp=1;
		//for(int e=1;e<6;e++)
		//{
		//	for(int f=1;f<6;f++)
		//	{
		//		System.out.print("  "+temp);				//4  25 square
		//		temp++;
		//	}
		//	System.out.println();
		//}


		
		//int temp=1;
		//for(int g=1;g<6;g++)
		//{
		//	for(int h=1;h<6;h++)
		//	{
		//		System.out.print(" "+temp);				//5   9 loop square
		//		temp=temp+2;
		//	}
		//	System.out.println();
		//}


		/*int temp=0;
		for(int k=1;k<6;k++)
		{
			for(int l=0;l<6;l++)
			{
				if(temp%2==0)
				{
					System.out.print(1);				//6      Binary square
				}
				else{
					System.out.print(0);
				}
				temp++;
			}
			System.out.println();
		}*/


		/*for(int m=0;m<5;m++)
		{
			for(int n=0;n<m;n++)
			{
				System.out.print("* ");					//7    pyramid extention with nums
			}
			System.out.println(m);
		}*/




		/*for(int o=0;o<5;o++)
		{
			for(int sp=5-o;sp>=0;sp--)
			{
				System.out.print(" ");
			}
			for(int p=0;p<o;p++)						//8     pyramid
			{
				System.out.print(" *");
			}
			System.out.println();
		}*/


		
		
		/*	String n="INDIA";
			for(int q=0;q<6;q++)
			{
				for (int r=0;r<q;r++)
				{
					System.out.print(n.charAt(r));			//9       India
				}
				System.out.println();
			 }  */



		/*	for(int o=0;o<5;o++)
			{
				for(int sp=5-o;sp>=0;sp--)
				{
					System.out.print(" ");
				}
				for(int p=0;p<o;p++)						//10	
				{
					System.out.print(" *");
				}
				System.out.println();
			}	*/



		/*	for(int x=0;x<5;x++)
			{
				for(int y=0;y<5;y++)
				{
					if(y==0||y==4||x==0||x==4)
					{								//11   Hollow square
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");	
					}
				}
				System.out.println();
			}*/
	}
}
