		package GameZone;
		import java.util.Scanner;
		public class CondoSales {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		int promptChoice = 0;
		int userChoice = 0;
		String result = null;
		
		  Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Condo Sales");
		System.out.println("We have varieties of condos to choose from");
		System.out.println("If you want to buy a condo. Pick a view.\n1- Parkview\n2- golfcourseview\n3- lakeview");
		userChoice = input.nextInt();
		if(userChoice == 1)
		{
			  result = "The cost of having condos with park views are $150,000";
			  System.out.println("After you have picked out condo. You can now pick out a prompt for your condo.");
			  System.out.println("n1- garage\n2- parking space.");
			  promptChoice = input.nextInt();
			  if(promptChoice == 1)
			  {
				  result = "You chose garage, you will have to pay the interest of $5000";
			  }
			  else if(promptChoice == 2)
			  {
				 result = "You chose parking space and it's free";
			  }
		}
		else if(userChoice == 2)
		{
			 result = "The cost of having condos with park views are $170,000";
			 System.out.println("After you have picked out condo. You can now pick out a prompt for your condo.");
			  System.out.println("n1- garage\n2- parking space.");
			  promptChoice = input.nextInt();
			 if(promptChoice == 1)
			  {
				  result = "You chose garage, you will have to pay the interest of $5000";
			  }
			  else if(promptChoice == 2)
			  {
				 result = "You chose parking space and it's free";
			  }
		}
		 
		else if(userChoice == 3)
		{
			 result = "The cost of having condos with park views are $210,000";
			 System.out.println("After you have picked out condo. You can now pick out a prompt for your condo.");
			  System.out.println("n1- garage\n2- parking space.");
			  promptChoice = input.nextInt();
			 if(promptChoice == 1)
			  {
				  result = "You chose garage, you will have to pay the interest of $5000";
			  }
			  else if(promptChoice == 2)
			  {
				 result = "You chose parking space and it's free";
			  }
		}
		 
		else
		{
			result = "Other choices are available";
		}
		displayMessage(result);
			}
			public static void displayMessage(String result)
			{
		System.out.println(result);
			}
		}
	
		