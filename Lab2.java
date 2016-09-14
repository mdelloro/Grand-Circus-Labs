import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Videogame
		Scanner scanner = new Scanner(System.in);

		// Welcome statement (if/else)
		// System.out.println("Welcome, human! What is your name?");>>>>How do I
		// place the name code? reference it?

		System.out.println("Welcome, human! What is your name?");
		String name = scanner.nextLine();

		// If you want to use a string within a sentence add a + symbol.
		System.out.println("Welcome " + name + "!" + " Do you want to play a game? (y/n?).");

		// strings
		String yesOrNo = scanner.next();

		if (yesOrNo.equalsIgnoreCase("y")) {

			// actual game

			// Intro (basic print lines)
			System.out.println("            ZAP!!!");
			System.out.println("**You are teleported to the nether.**");
			System.out.println("You have to escape and fight your way out...");
			System.out.println("Which door do you choose? 1, 2 or 3?");

			// Door Scene (switch statements)
			int door = scanner.nextInt();
			switch (door) {

			case 1:
				System.out.println("You almost died but come to a room with weapons.");
				break;
			case 2:
				System.out.println("You are almost captured and eaten but eventually come to a room of weapons.");
				break;
			default:
				System.out.println("You find weapons. Which weapon do you choose?");
				break;
			}

			// choosing weapons ( if/ else )
			System.out.println("Choose a weapon: sword/bow?");
			String weapon = scanner.next();

			// Sword or bow?
			if (weapon.equals("sword")) {
				System.out.println("A mighty weapon! Your level is over 9000!");

				// Sword Scenes
				System.out.println("Do you wish to fight the Enderdragon to escape? (y/n)");
				yesOrNo = scanner.next();
				if (yesOrNo.equalsIgnoreCase("y")) {
					System.out.println("You conquered the Enderdragon by slicing its head off. You win!");

					// Sword Scene II
					System.out.println("You eventually escaped despite the variables.");
					System.out.println("You are rewarded with a boolean trophy, yay.");
					System.out.println("Congrats, " + name + ".");
					// How do you quote someone's name??

					// Don't fight Enderdragon
				} else {
					System.out.println("A wild pikachu appears. You have no pokeballs. Try again.");

				}

				// Bow Scenes
			} else {
				System.out.println("Do you wish to fight Goku to escape (y/n)?");
			}
			yesOrNo = scanner.next();
			if (yesOrNo.equalsIgnoreCase("y")) {
				System.out.println("#KAMEHAMEHA!#>>>>>>>     You died! Try again");
			} else {
				System.out.println("A wild java developer appears and strung you. Try again.");

			}

			// I don't want to play brackets...
		} else {
			System.out.println("Okay, goodbye.");

		}

	}

}
