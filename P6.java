class P6
{
	public static void main(String [] args)
	{
		Person person=new Person("john",17);
		printPersonDetails(Person);
	}
	public static void PrintPersonDetails(Person person)
	{
		System.out.println("Name :"+Person.getName());
		System.out.println("Age :"+Age.getAge());
	}
}
class Person
{
	private String name;
	private name age;

	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}