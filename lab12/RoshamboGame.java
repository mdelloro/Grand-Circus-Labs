package lab12;

import java.util.Scanner;

public class RoshamboGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello. Do you want to play against a random or rock?");
		String choice = scanner.next();
		
		
		Player opponent;
		switch (choice) {
		case "random":
			opponent = new RandomPlayer("Le Random Player");
			break;
		case "rock":
			opponent = new RockPlayer("Le Rock Player");
			break;
			default:
				throw new IllegalArgumentException("Must type 'random' or 'rock'");
				
				
		}
		
		System.out.println("Your opponent chose " + opponent.generateRoshambo());
		
		opponent = new RockPlayer("Random");
		System.out.println(opponent.generateRoshambo()); 
		
		
		opponent = new RandomPlayer("Rock");
		System.out.println(opponent.generateRoshambo());
		
		
	}

}
