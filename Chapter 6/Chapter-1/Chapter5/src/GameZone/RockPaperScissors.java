	package GameZone;
	import java.util.Scanner;
	public class RockPaperScissors {
	
		public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
	
			System.out.print("welcome to Rock,Paper,Scissors");
	
			int playerChoice;
			int computerChoice;
			int countWins = 0;
			int countLoss = 0;
			int countTies = 0;
			int again = 0;
			String result = null;
	
	 
			Scanner input = new Scanner(System.in);
			
			do 
			{
				System.out.println("\n1- Rock\n2- Paper\n3- Scissors");
				playerChoice = input.nextInt();
				computerChoice = (int)(Math.random() * 3 + 1);
				
				if(playerChoice == 1)
				{
					result = "You have chose Rock";
					if(playerChoice == 1 && computerChoice == 1)
					{
						result = "Rock cannot beat Rock. It's a tie";
						countTies++;
					}
					else if(playerChoice == 1 && computerChoice == 2)
					{
						result = "Rock cannot beat paper. You lose";
						countLoss++;
					}
					else if(playerChoice == 1 && computerChoice == 3)
					{
						result = "Rock can beat Scissors. You win";
						countWins++;
					}
				}
				else if(playerChoice == 2)
				{
					result = "You have chose Paper";
					if(playerChoice == 2 && computerChoice == 1)
					{
						result = " Paper can beat rock. You win";
						countWins++;
					}
					else if(playerChoice == 2 && computerChoice == 2)
					{
						result = "Paper cannot beat paper. It's a tie";
						countTies++;
					}
					else if(playerChoice == 2 && computerChoice == 3)
					{
						result = "Paper cannot beat Scissors. You lose";
						countLoss++;
					}
				}
				else if(playerChoice == 3)
				{
					result ="You have choice Scissors";
					if(playerChoice == 3 && computerChoice == 1)
					{
						result = "Scissors cannot beat Rock. You lose";
						countLoss++;
					}
					else if(playerChoice == 3 && computerChoice == 2)
					{
						result = "Scissors can beat paper. You win";
						countWins++;
					}
					else if(playerChoice == 3 && computerChoice == 3)
					{
						result = "Scissors cannot beat Scissors. It's a tie";
						countTies++;
					}
				}
				System.out.println("Would you like to play again");
				System.out.println("\n1- Yes\n2- No");
				again = input.nextInt();
				
				
			}while(again == 1);
			System.out.println(result);
			
			System.out.println(" Player Wins " + countWins + " Computer Loses " + countLoss);
			System.out.println(" Player Loses " + countLoss + " Computer Wins " + countWins);
			System.out.println(" Player Ties " + countTies + " Computer Ties " + countTies);
	
		}
	
	}
