class P13
{
	private String name;
	private int age;
	private String address;
	
	public Person(String name,int age,String adress)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String getName
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
	public String getAddress(String address)
	{
		this.address=address;
	}
	public void introduce()
	{
		System.out.println("Name:"+name+",Age:"+age+",Address:"+address);
	}
	public static void main(String [] args)
	{
		Person person=new Person("Asta",112,"Upleta");
		person.introduce();
	}
}