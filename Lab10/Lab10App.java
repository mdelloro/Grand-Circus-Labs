package Lab10;

import java.util.ArrayList;

import java.util.Scanner;

public class Lab10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to the Movie List App!\nThere are 10 movies in this list.\nType one of the categories to learn more!\nScifi, Action, Comedy, Foreign.");
		Scanner scanner = new Scanner(System.in);
		
Movie movie = new Movie(null, null);
		
		ArrayList <Movie> movieList = new ArrayList<Movie>();
		
		movieList.add(new Movie ("Captain America", "Action"));
		movieList.add(new Movie ("The Avengers", "Action"));
		movieList.add(new Movie ("Superman", "Action"));
		movieList.add(new Movie ("Aliens", "Scifi"));
		movieList.add(new Movie ("Predators", "Scifi"));
		movieList.add(new Movie ("Liar Liar", "Comedy"));
		movieList.add(new Movie ("Wedding Crashers", "Comedy"));
		movieList.add(new Movie ("Just Friends", "Comedy"));
		movieList.add(new Movie ("Ong Bok", "Foreign"));
		movieList.add(new Movie ("Amelie", "Foreign"));
		
		
		System.out.print(movieList);
			}


	
			}
		
		
	


