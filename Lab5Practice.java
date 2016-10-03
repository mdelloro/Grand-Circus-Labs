import java.util.Scanner;

public class Lab5Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Grand Circus Casino!\n How many sides should each die have? (4-6)");

		Scanner scanner = new Scanner(System.in);
		String yesOrNo = "y";
		int numberOfSides = scanner.nextInt();
		while (yesOrNo.equalsIgnoreCase("y")) {
			int die1 = rollADice(numberOfSides);
			int die2 = rollADice(numberOfSides);

			if (numberOfSides >= 4 && numberOfSides <= 6) {
				System.out.println(die1 + "\n" + die2);
				
			} else {
				System.out.println("Must be numbers 4-6! Try again!");
			}
			System.out.println("Roll Again? (y/n)");
			yesOrNo = scanner.next();
		} 
	}

	public static int rollADice(int numberOfSides) {
		int randomRoll = (int) (Math.random() * 6 + 1);

		return randomRoll;
	}
}
