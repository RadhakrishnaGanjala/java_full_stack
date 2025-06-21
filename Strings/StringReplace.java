class StringReplace
{
	public static void main(String[] args)
	{
		String st1="Radhakrishna ad  adha";
		String st2="radha";
		System.out.println(st1.replace("a"," "));
		System.out.println(st1.replaceAll("a"," "));
		System.out.println(st2.replaceFirst("a"," "));
	}
}