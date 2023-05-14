package avgRect;

public class neatOutput {

	public static void main(String[] args) {
	Rectangle rect1 = new Rectangle(4.0, 5.0);
	Rectangle rect2 = new Rectangle(5.7, 8.1);
	System.out.println("Rectangle with sides " + rect1.getLength() + "and " + rect1.getWidth() + " has area " + rect1.computeArea());
	System.out.println("Rectangle with sides " + rect2.getLength() + "and " + rect2.getWidth() + " has area " + rect2.computeArea());
	
	Circle circ1 = new Circle(4.2);
	Circle circ2 = new Circle(3.0);
	System.out.println("Circle with radius " + circ1.getRadius() + " has area " + circ1.computeArea());
	System.out.println("Circle with radius " + circ2.getRadius() + " has area " + circ2.computeArea());
	
	System.out.println("You created " + Rectangle.numRectangles + " rectangles and " + Circle.numCircles + " circles.");
	int totShapes = Rectangle.numRectangles + Circle.numCircles;
	System.out.println("That is " + totShapes + " in total.");
	}
}
