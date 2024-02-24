class p17
{
	public static void main(String [] args)	
	{
		MyClass1 myClass1=new MyClass1();
		MyClass2 myClass2=new MyClass2();
		
		String result1=myClass1.method1("Hello");
		int ressult2=myClass2.method(5,3);

		System.out.println("Result from MyClass1 :"+result1);
		System.out.println("Result from MyClass2 :"+result2);
	}
}
class MyClass1
{
	public String method1(String input)
	{
		return "Method1 result :"+input.toUppercase();
	}
}
class MyClass2
{
	public int method2(int a,int b)
	{
		return a*b;
	}
}