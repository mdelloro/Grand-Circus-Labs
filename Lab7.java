import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// You can declare variables of the same type on the same line.
		// as long as you separate your variable name with a comma.

		int studentIndex = 0;
		String choice = "y";

		String name[] = { "1. Kim", "2. Chelsea", "3. Celena", "4. David", "5. Tricia", "6. Mark", "7. James", "8. Julia", "9. Robert", "Josh",
				"11. Vish", "12. Narmatha", "13. Samuel", "14. Jackson", "15. Kimberly", "16. Joseph", "Maria", "Kerry", "Kaye", "Patrick" };
		// by putting the words in curly brackets, you declare the amount of
		// arrays
		String homeTown[] = { "Detroit", "Flint", "Taylor", "Ypsilanti", "Ann Arbor", "Detroit", "Flint", "Taylor",
				"Ypsilanti", "Ann Arbor", "Detroit", "Flint", "Taylor", "Ypsilanti", "Ann Arbor", "Detroit", "Flint",
				"Taylor", "Ypsilanti", "Ann Arbor" };
		String favFood[] = { "Pizza", "Tacos", "Hotdogs", "Chilli", "Chicken", "Pizza", "Tacos", "Hotdogs", "Chilli",
				"Chicken", "Pizza", "Tacos", "Hotdogs", "Chilli", "Chicken", "Pizza", "Tacos", "Hotdogs", "Chilli",
				"Chicken" };
		// pg 458 shows how to use for loops with arrays

		

		// end of for-loop to print out list of names.
		System.out
				.println("Welcome to Grand Circus. Who would you like to learn more about?" + "(Enter a number 1-20)");
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			// write code to print out list of names.
			// have your system out have a number in it.

		}
		studentIndex = sc.nextInt();

		System.out.print(studentIndex);

	} // end of main method
} // end of class

/*
 * // Create an array with room for 100 integers int[] nums = new int[100];
 * 
 * //Fill it with numbers using a for-loop for (int i = 0; i < nums.length; i++)
 * nums[i] = i + 1; // +1 since we want 1-100 and not 0-99
 * 
 * //Compute sum int sum = 0; for (int n : nums) sum += n;
 * 
 * //Print the result (5050) System.out.println(sum);
 */

