package studio7;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double initLength, double initWidth) {
		this.length = initLength;
		this.width = initWidth;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
	public boolean getSquare() {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	public static String compareArea(Rectangle first, Rectangle second) {
		if(first.getArea()>second.getArea()) {
			return "First Rectangle is Bigger";
		}
		else if(first.getArea()==second.getArea()) {
			return "They are the same Area";
		}
		else {
			return "Second Rectangle is Bigger";
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(0.5,1);
		Rectangle b = new Rectangle(1.8, 0.2);
		System.out.println(a.getArea());
		System.out.println(a.getPerimeter());
		System.out.println(a.getSquare());
		System.out.println(compareArea(a,b));
	}

}
