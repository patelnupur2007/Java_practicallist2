class Cirlce
{
	double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
}
public class P4
{
	public static void main(String [] args)
	{
		Circle circle=new Circle(5);
		double area=Circle.getArea();
		System.out.println("The area of the circle is ::"+area);
	}
}