class Person
{
	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public Person(Person otherPerson)	
	{
		this.name=otherPerson.name;
		this.age=otherPerson.age;
	}
	public void display Info()
	{
		System.out.println("Name:"name+",Age:"+age);
	}
}
class P9
{
	public static void main(String [] args)
	{
		Person Person1=new Person("Asta",17);
		Person Person2=new Person(Person 1);
	
		System.out.println("Person 1":Person1.displayInfo());
		System.out.println("Person 2":Person2.displayInfo());
	}
}