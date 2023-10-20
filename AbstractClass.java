import java.util.*;
public class AbstractClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
	}

}
abstract class Shapes{
	abstract public void numberOfSides();
		
}
class Rectangle extends Shapes{
	public void numberOfSides() {
		System.out.println("Number of sides of Rectangle =4");
		
	}
	
}
class Triangle extends Shapes{
public void numberOfSides() {
 System.out.println("Number of sides of Triangle = 3");
	
}
}
class Hexagon extends Shapes{
	public void numberOfSides() {
		System.out.println("Number of sides of Hexagon= 6");
		
	}
}
