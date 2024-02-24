class Person
{
	private String name;
	private int age;
	private String address;
	
	public Person(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public string getaddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void introduce()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
}
class P10
{
	public static void main(String [] args)
	{
		Person person=new Person("Asta",17,"Upleta");
		Person.introduce();
	}
}