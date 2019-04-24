import java.util.Scanner;

public class Lab03Program {
	public static void main(String[] args) {
		
		// Prompt user to enter the integer
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 100: ");
		int x = scan.nextInt();
		
		// Calculates for odd or even number
		int userNum = x % 2;
		
		// Calculates the output using if else statements
		if((userNum != 0) && (x <= 60)) {
			System.out.println(x + " and Odd");
		} else if ((userNum != 0) && (x > 60)) {
			System.out.println(x + ", Odd and over 60");
		} else if ((userNum == 0) && (x >= 2) && (x < 25)) {
			System.out.println("Even and less than 25");
		} else if ((userNum == 0) && (x >= 26) && (x <= 60)) {
			System.out.println("Even");
		} else {
			System.out.println(x + " and Even");
		}
		
		scan.close();
		
	}

}
