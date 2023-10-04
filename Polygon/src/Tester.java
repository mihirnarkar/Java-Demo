interface A{
	
}

interface B{
	
}


abstract class Polygon{
	abstract public double calArea();
	abstract public double calPerimiter();
	
	public void newHey() {
		System.out.println("Hey");
	}
	
}

class Circle extends Polygon{
	private int radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(int r) {
		radius = r;
	}
	
	public double calArea() {
		return 3.142 * radius * radius;
	}
	
	public double calPerimiter() {
		return 2 * 3.14 * radius;
	}
}


class Rectangle extends Polygon{
	private int len,bth;
	
	public Rectangle() {
		len=bth=1;
	}
	
	public Rectangle(int l,int b) {
		len = l;
		bth = b;
	}
	
	public double calArea() {
		return len * bth;
	}
	
	public double calPerimeter() {
		return 2 * (len + bth);
	}
}


class Square extends Rectangle{
	
	public Square() {
		
	}
	
	public Square(int s) {
		super(s,s);
	}
	
	public double calArea() {
		return super.calArea();
	}
	
	public double calPerimeter() {
		return super.calPerimeter();
	}
}

public class Tester {

	public static void main(String[] args) {
		Circle c = new Circle(10);
		System.out.println("Area of circle: "+c.calArea());
		System.out.println("Perimeter of circle: "+c.calPerimiter());
		
		Rectangle r = new Rectangle(2,2);
		System.out.println("Area of rectangle: "+r.calArea());
		System.out.println("Perimeter of rectangle: "+r.calPerimeter());
		
		Square s = new Square(2);
		System.out.println("Area of square: "+s.calArea());
		System.out.println("Perimeter of square: "+s.calPerimeter());
		
		
	}

}
