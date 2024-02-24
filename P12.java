class Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public int divide(int a,int b)
	{
		if(b==0)
		{
			throw now ArithmeticException("Cannot divide by zero");
		}
		return a/b;
	}
}
public class P12
{
	public static void main(String [] args)
	{
		Calculator caculator=new Calculator();
		
		System.out.println("Addition :"+calculator.add(5,3));
		System.out.println("Substraction:"+calculator.subtract(4,6));
		System.out.println("Multiplication:"+calculator.multiply(4,6));
		System.out.println("Division:"+calculator.divide(10,2));
	}
}