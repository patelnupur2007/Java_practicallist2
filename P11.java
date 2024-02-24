class Person
{
	private String name;
	private int age;
	
	public person()
	{
		this.name=" ";
		this.age=0;
	}
	public void main(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void introduce()
	{
		System.out.println("Hello, My name is"+this.name+"and I am"+this.age+"years old.");
	}
}
class P11
{
	public static void main(String [] args)
	{
		Person Person1=new Person();

		Person1.setName("Asta");
		Person1.setAge(17);
	
		Person1.introduce();
	}
}