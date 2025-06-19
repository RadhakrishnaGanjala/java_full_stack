class InstanceMethodsInStaticMethods
{
	static int a;
	static void static1(a)
	{
		System.out.println("Its an Static method ");
	}
	void instance1()
	{
		System.out.println("Its an Instance method");
		static1();
	}
	public static void main(String[] args)
	{
		InstanceMethodsInStaticMethods in=new InstanceMethodsInStaticMethods();
		in.instance1();
		int a=in.instance1;
		in.static1(a);
		
	}
}
		