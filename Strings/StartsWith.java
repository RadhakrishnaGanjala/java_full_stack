class StartsWith
{
	public static void main(String[] args)
	{
		String st1="Radhakrishna";
		String st2="radha";
		System.out.println(st1.equalsIgnoreCase(st2));
		System.out.println(st1.startsWith("Radha"));
		System.out.println(st1.endsWith("Radha"));
		System.out.println(st1.compareTo(st2));
	}
}
