class RegexMatches
{
	public static void main(String[] aargs)
	{
		String st1="Radha";
		String st2="bsbbqj";
		String regex="Radha|krishna|Ganjala";
		System.out.println(st1.matches(regex));
		System.out.println(st2.matches(regex));
	}
}
