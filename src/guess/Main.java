package guess;

import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		int secret = 5;
		int numGuess = 1;
		int guess = 0;

		Scanner key = new Scanner(System.in);

		System.out.println("Guess from 0 to 10");

		for(int x = 0; x < numGuess; x++){
			System.out.print("GUESS: ");
			guess = key.nextInt();

			if(guess != secret)
				System.out.println("Wrong");
			else
				System.out.println("Right");

		}

		System.out.println("Program closing");

	}
}