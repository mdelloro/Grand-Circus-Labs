package lab9;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
		
System.out.println("Enter radius");
double r = scanner.nextInt();

Circle circle = new Circle(r);
System.out.println(circle.getArea());


//call a new instance of the circle class.		
	}

}
