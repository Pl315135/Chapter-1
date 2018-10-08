package practice;
import java.util.Scanner;
public class Doorgame {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int doorChoice;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game !");
		System.out.println("your host Steve Harvey");
		System.out.println("Pick any door.\n1-for door one\n2-for door two\n3-for door three");
		doorChoice = input.nextInt();
		
			if(doorChoice == 1)
			{
				result = "Pile of Gold";
			}
			else if(doorChoice == 2)
			{
				result = "Nothing";
	}
			else if(doorChoice == 3) 
			{
				result = "A trip to anywhere";
			}
			else
			{
				result = "nothing because that was not a choice!";
			}
			displayMessage(result);
}
	public static void displayMessage(String result)
{
	System.out.println("You won " + result);
}
}
