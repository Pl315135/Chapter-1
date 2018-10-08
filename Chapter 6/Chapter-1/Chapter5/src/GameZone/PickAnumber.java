	package GameZone;
	import java.util.Scanner;
	import java.util.Random;
	public class PickAnumber {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int userGuess;
			int computerSecret;
			int quit = 0;
			
			String result = null;
			
			computerSecret = (int)(Math.random() * 10 + 1);
			
			 Scanner input = new Scanner(System.in);
			
			do
			{
			System.out.println("Pick any number as long as its no higher than 10! >>");
			userGuess = input.nextInt();
			
			if(userGuess < computerSecret)
			{
				result = "The Number is higher";
			}
		  
		else if(userGuess > computerSecret)
		{
			result = "The Number is lower " + computerSecret;
		}
		else if(userGuess == computerSecret)
		{
		result = "You win";
		}
		 displayMessage(result);
		 System.out.println("Do you want to quit ?/ n1- for yes / n2- for no >>");
		}while(1 != quit || userGuess != computerSecret);
		}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}
}
	
