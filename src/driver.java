import Shapes.Square;
import Shapes.Rectangle;
import utilis.Math;

public class driver {

	public static void main(String[] args) {
		 Square a= new Square(100);
		 System.out.println(a.getArea());
		 Rectangle b =new Rectangle(50,80);
		 System.out.println(b.getArea());
		 double var=15.6;
		 System.out.println(Math.factorial((int) var));
		 System.out.println(Math.factorialLoop((int) var));
		 
	}
}
