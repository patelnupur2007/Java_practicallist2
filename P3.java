class Abc()
{
	Abc()
	{
		System.out.println("This program is Overloaded Constructor.");
	}
	Abc(int a,int b)
	{
		System.out.println("Addition of two numbers are ::"+(a+b));
	}
	Abc(double c)
	{
		System.out.println("Square of two numbers are ::"+(c*c));
	}
}
class P3
{
	public static void main(String [] args)
	{
		Abc a1=new Abc();
		Abc a2=new Abc(10,20);
		Abc a3=new Abc(5);
	}
}