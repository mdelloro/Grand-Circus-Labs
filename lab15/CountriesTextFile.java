package Lab15;

import java.io.IOException;
import java.nio.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.io.*;
/**
 * 
 * @author ExperienceITAllStars
 * 
 * Lab 15: Create an app that prompts users to read and write
 * a list of countries to an external file. This class stores
 * the methods used to read and write to the external file. 
 *
 */
public class CountriesTextFile {
	ArrayList<String> countryList = new ArrayList<String>();
	/**
	 * 
	 * This is the ArrayList that will store our list of 
	 * countries. We need to move this ArrayList into 
	 * the CountryApp class and add our countries to the
	 * ArrayList from there. 
	 *
	 */

	/**
	 * this is the method we will use to write our ArrayList
	 * to the external file country.txt
	 * 
	 * Instead of trying to populate the ArrayList of countries
	 * from inside of the method, we should do that in the 
	 * CountriesApp class and pass in an ArrayList as an argument
	 * of the method. 
	 */
	public ArrayList<String> writeCountryFile() throws IOException {

		for (String countries : countryList) {
			countryList.add(CountriesApp.country);// move this to CountriesApp class

		}
		return null;

	}

	// this is the method that we use to read from the external file. 
	public ArrayList<String> readCountryFile() {

		return null;
	}

}