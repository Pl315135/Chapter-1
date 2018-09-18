	package practice;
	import java.util.Scanner;
	public class Agegame 
	{
	
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			int usersAge;
			String result;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your age to consulted");
			usersAge = input.nextInt();
			if(usersAge >= 12)
			{
				result = "you are a child!";
			}
			else if(usersAge >= 13 && usersAge <= 18)
			{
				result = "you are a teenager";
			}
			else if(usersAge >= 29 && usersAge <= 25)
			{
				result = "Get a job,you bum";
			}
			displayMessage()
		
		}
	
	}
