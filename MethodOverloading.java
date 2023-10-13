import java.util.Scanner;
public class MethodOverloading {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the length and breadth of the Reactangle :");
    int length = input.nextInt();
    int breadth = input.nextInt();
    System.out.println("Enter the base and height of the Triangle :");
    float base = input.nextFloat();
    float height = input.nextFloat();
    System.out.println("Enter the radius of the circle :");
    float radius = input.nextFloat();
    Shape shape = new Shape();
    shape.area(length,breadth);
    shape.area(base,height);
    shape.area(radius);
	}

}
class Shape {
	int area;
	public void area(int length,int breadth) {
		area = length*breadth;
		System.out.println("Area of Rectangle with length "+length+" and breadth "+breadth +" is : "+area);
	}
	public void area(float base,float height) {
		
		System.out.println("Area of Triangle with base "+base+" and height "+height+" is : "+(base*height)/2);
	}
	public void area(float radius) {
		System.out.println("Area of circle with radius "+radius+" is : "+3.14*radius*radius);
	}
}
