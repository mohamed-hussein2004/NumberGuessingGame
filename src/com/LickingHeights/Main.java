package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int randomNummber;
	int guess;
		Scanner  keyboard;
		keyboard = new Scanner(System.in);
	String correct;

		System.out.println("Guess the number i am thinking of 1 - 100");
		guess = keyboard.nextInt();
	randomNummber = (int) (Math.random()*100)+1;
	
	do{
		guess = keyboard.nextInt();
		if (guess > randomNummber) {
			System.out.println("your to high");
		}
		else if (guess < randomNummber) {
			System.out.println("your to low");
		}
		else {
			System.out.println("correct");
		}



	}while (guess != randomNummber);




	}

   }

