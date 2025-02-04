package helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world !");
		
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String firstName = keyboard.nextLine();
		int groupNumber;
		do {
			System.out.println("Enter your group number:");
			groupNumber = keyboard.nextInt();
		}while (groupNumber<1 || groupNumber>3);
		
		System.out.println("Welcome "+ firstName+" from G"+ groupNumber+" to the Object-Oriented Development class!");
		
		keyboard.close();
	}

}
