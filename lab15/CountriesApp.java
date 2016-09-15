
package Lab15;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * 
 * @author ExperienceITAllStars
 * 
 *         Lab 15: Create and app that prompts users to read and write countries
 *         from an external file. This class is the main where we run the
 *         application.
 *
 */
public class CountriesApp {

	public static void main(String[] args) throws IOException {
		/**
		 * create scanner to store user input into a String variable for the
		 * name of a country
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a country:");

		String country = sc.nextLine();
		System.out.println(country);
		
		/**
		 *  create a new file to read and write to. 
		 */
		String fileString = "country.txt";
		Path filePath = Paths.get(fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println(filePath.toFile());
		}
	}

}
