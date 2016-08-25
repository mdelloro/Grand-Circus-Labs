import java.util.Scanner;

public class Lab1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String proceed = "y";
		
		Scanner scanner = new Scanner(System.in); //this allows user to input data
	
		System.out.println("Please type in Length:"); //display
		float Length = scanner.nextInt(); // input code int or float
		
		System.out.println("Please type in Width:"); // display
		float Width = scanner.nextInt(); // input code int or float or double
		
		float area = Length * Width; // function
		System.out.println("Area:"); // display
		System.out.println(area); // Answer
		float Perimeter = (2 * Width) + (2 * Length); //function
		System.out.println("Perimeter:"); // display
		System.out.println(Perimeter); // Answer
		
		System.out.println("Continue? y/n");
		proceed = scanner.next("y");
		while (proceed.equalsIgnoreCase ("y"));
		
		
		
				
	}
	    
	
}
	
	
//camelcase

		//float is how you use decimals
		// \ - gives a break in the line
//string proceed = "y";
// while (proceed.equalsignorecase ("y"))
//proceed = scanner.next();
//System.out.println();
