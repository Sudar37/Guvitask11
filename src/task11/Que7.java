package task11;

import java.util.Scanner;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String errorMessage) {
        super(errorMessage);
    }
}

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
        int age = sc.nextInt();
       try {
           if (age < 18) 
            {
                throw new InvalidAgeException("Age must be greater than or equal to 18.");
            }
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: InvalidAgeException: " + e.getMessage());
       }
	}

}

