class P16
{
	public static void main(String [] args)
	{
		Scanner scanner=new scanner(System.in);
		
		System.out.println("Enter your name :");
		String name=scanner.nextLine();

		System.out.println("Enter your age :");
		int age=scanner.nextLine();

		System.out.print("Enter your Favourite color :");
		String favouriteColor=scanner.nextLine();

		scanner.close();
		String message=String.format("Hello,%s! You are %d years old and your favourite color is %s.",name,age,favouriteColor);
		System.out.println(message);
	}
}