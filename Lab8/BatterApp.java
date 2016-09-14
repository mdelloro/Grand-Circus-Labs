package Lab8;


import java.util.ArrayList;
import java.util.Scanner;

public class BatterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yesNo = "y";
		int atBats = 0;
		int atLeastOne = 0;
		int basesEarned = 0;
		int basesEarnedTotal = 0;
		int i = 0;

		System.out.println("Welcome To Batting Average Calculator\n");

		System.out.println("Please enter name:");
		String name = sc.next();

		do {
			System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
			basesEarned = sc.nextInt();

			if (basesEarned > 0) {
				atLeastOne++;
			}
			
			System.out.println("Result for at-bat " + i + ": " + basesEarned);

			System.out.println("Another at-bat? (y/n)");
			yesNo = sc.next();
			
			atBats++;
			i++;
			basesEarnedTotal += basesEarned;
		}while (!(yesNo.equals("n")));

		

		Batter batter = new Batter(name, basesEarnedTotal);

		ArrayList<Batter> batterInfo = new ArrayList<>(50);
		batterInfo.add(batter);

		System.out.println(batter);
		System.out.println(batter.getBattingAvg(atLeastOne, atBats));
		System.out.println(batterInfo.get(0));

	}

}