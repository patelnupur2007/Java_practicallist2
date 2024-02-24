class P15
{
	public static void main(String [] args)
	{
		int num=10;
		Integer WrappedNum=Integer.valueof(num);

		System.out.println("Wrapped value:"+WrappedNum);
		String strNum="20";
		int ParsedNum=Integer.ParseInt(StrNum);
	
		System.out.println("Parsed value :"+ParsedNum);
	}
}