import java.util.Scanner;
// notes 



public class Lab6 {

	public static void main(String[] args) {
		System.out.println("please enter a word");
		Scanner in = new Scanner(System.in);
		String engWord = in.nextLine();

		System.out.println( pigSentence(engWord));

	}

	public static String pigSentence(String word) {

		char startLetter = word.charAt(0);
		if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o'
				|| startLetter == 'u') {
			word = word.concat("yay");

		} else {
			String startconso = "";
			if (word.charAt(1) == 'h') {
				startconso = word.substring(0, 2);
				word = word.concat(startconso).concat("ay");
				word = word.substring(2);
			} else {
				startconso = String.valueOf(startLetter);
				word = word.concat(startconso).concat("ay");
				word = word.substring(1);
			}

		}
		return word;
	}
}