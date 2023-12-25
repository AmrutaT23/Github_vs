//Write a java program to create a class called shape with methods called getParameter() and getarea().create a subclass called circle that overrides the getPerameter()and getArea() methods to calculate the area and perimeter of a circle.

class Shape
{
	
	double pie=3.14;
	void getParimeter(double r)
	{
		System.out.println("Radius for perimeter is:"+r);
	}
	void getArea(double r1)
	{
		System.out.println("Radius for area is:"+r1);
	}
}
class Circle extends Shape
{
	
	void getParimeter(double r)
	{
		double cal=2*pie*r;
		System.out.println("Perimeter of circle  is:"+cal);
	}
	void getArea(double r1)
	{
		double cal1=pie*r1*r1;
		System.out.println("Area of circle is:"+cal1);
	}
public static void main(String args[])
{
	Circle c = new Circle();
	Shape s = new Shape();
	
	double Radius=5;
	double Radius1=9;

	s.getParimeter(Radius);
	s.getArea(Radius1);
	c.getParimeter(Radius);
	c.getArea(Radius1);
}
}
