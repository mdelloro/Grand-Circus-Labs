import java.util.Scanner;

public class Lab1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scanner = new Scanner(System.in);
		String yesOrNo = "y";

		while (yesOrNo.equalsIgnoreCase("y")) {

			System.out.println("Measure Area, Perimeter, and Volume!");
			System.out.println("What is the length?");
			double Length = scanner.nextInt(); // this is a form of a string

			System.out.println("what is the width?");
			double Width = scanner.nextInt();

			System.out.println("what is the height?");
			double Height = scanner.nextInt();

			System.out.println("The Area and Perimeter are:");
			System.out.println("Perimeter:" + (2 * Length + 2 * Width) + "\r" + "Area:" + (Length * Width) + "\r"
					+ "Volume:" + (Height * Width * Length));

			System.out.println("Continue? (y/n): ");
			yesOrNo = scanner.next();

		}
	}
}    
	

	
	
//camelcase

		//float is how you use decimals
		// \ - gives a break in the line
//string proceed = "y";
// while (proceed.equalsignorecase ("y"))
//proceed = scanner.next();
//System.out.println();
