import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("I'm thinking of a number between 1 and 100(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		int YOUR_GUESS = in.nextInt();
		Random random= new Random();
		int number = random.nextInt(100) + 1;	
		GuessAgain(YOUR_GUESS, number);
	}
	
	public static void GuessAgain (int YOUR_GUESS, int number) {
		if (YOUR_GUESS==number) {
			System.out.print("You guessed it!");
		}else if (YOUR_GUESS>number) {
			System.out.print("The guess is too high, try again: ");
			YOUR_GUESS = in.nextInt();
			GuessAgain(YOUR_GUESS, number);
		} else if (YOUR_GUESS<number) {
			System.out.print("The guess is too low, try again: ");
			YOUR_GUESS = in.nextInt();
			GuessAgain(YOUR_GUESS, number);
		}
	}
}
