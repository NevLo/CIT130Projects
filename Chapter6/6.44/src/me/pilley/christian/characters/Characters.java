package me.pilley.christian.characters;

import java.util.Scanner;

public class Characters {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean correctInput = false;
		String inputString = "";

		while (!correctInput) {
			System.out.print("Enter a word with '@' in it\n>>> ");
			inputString = input.nextLine();
			if (inputString.contains("@")) {
				
				correctInput = true;
			}
		}
		System.out.println(inputString);
	}
}
