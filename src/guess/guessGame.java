package guess;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class guessGame{
	public static void main(String args[]){

		int min = 0, max = 10;

		int secret = ThreadLocalRandom.current().nextInt(min, max);
		int numGuesses = 1;
		int guess = 0;

		Scanner key = new Scanner(System.in);

		System.out.println("Guess from " + min + "to " + max);

		for(int x = 0; x < numGuesses; x++){
			System.out.print("GUESS: ");
			guess = key.nextInt();

			if(guess!=secret){
				String hiLow = guess > secret? "Higher!": "Lower!";
				System.out.println(hiLow);
			}
			else{
				System.out.println("Correct!")
			}

		}

		System.out.println("Out of guesses! Program closing");

	}
}