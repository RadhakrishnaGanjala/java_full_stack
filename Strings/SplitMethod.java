class SplitMethod
{
	public static void main(String[] args)
	{
		String st="Hello My self Radhakrishna Ganjala ,I am from Machilipatnam";
		String regex="[\\.\\s\\ ]";
		String []arr=st.split(regex);
		for(String i:arr)
		{
			System.out.println(i);
		}
	}
}