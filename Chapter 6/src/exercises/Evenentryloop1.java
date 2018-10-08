package exercises;

import java.util.Scanner;

public class Evenentryloop1 {

	public static void main(String[] args) 
	// TODO Auto-generated method stub
	{
		int userChoice;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println( "Please pick a number: ");
			userChoice = input.nextInt();
			if(userChoice % 2 == 0)
			{
				System.out.println("Good Job !");
				
			}
			else 
				System.out.println("error");
		}while(userChoice != 999);
	}

}
