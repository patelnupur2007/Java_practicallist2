class P5
{
	int num;
	P5()
	{
		this(10);
	}
	P5(int num)
	{
		this.num=num;
	}
	void display()
	{
		System.out.println("Value of numa  ::"+this.num);
	}
	public static void main(String [] args)
	{
		P5 obj=new P5();
		obj.display();
	}
}