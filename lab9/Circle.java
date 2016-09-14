package lab9;

public class Circle {

	private double radius; // the r is fromt he user input. the radius is the term you're going to use. 
	public Circle(double r) { radius = r;
	};

	public double getCircumference() {
		return 0.0;
	};

	public String getFormattedCircumference() {
		return "y";
	};

	public double getArea() { // you can only whats inside the body and not in the arguments 
		return Math.PI * radius * radius;
		
	};

	public String getFormattedArea() {
		return "x";
	};

	private String formatNumber(double x) {
		return "z";
	};

	public static int getObjectcount() {
		return 0;
	};

}

/*
 * You are trying to define a method without defining it. Methods (when not
 * being abstract or declared in interfaces) always need the method head (void
 * method()) and a body ({ ... }). In the lines you have marked, you are only
 * defining the head but not the body.
 * 
 * If you want to have this method declared without instantly defining the body,
 * you need to make them abstract.
 */