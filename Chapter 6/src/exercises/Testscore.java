package exercises;
import java.util.Scanner;
public class Testscore {

	public static void main(String[] args) 
	// TODO Auto-generated method stub
	{
		
		Scanner input = new Scanner(System.in);
		int userChoice = 0;
		int high = 0;
		int low = 100;
		int average = 0;
		int count = 0;
	    int total = 0;
	  
	   do 
	   {
		   System.out.println("Please enter the test scores here:");
		    userChoice = input.nextInt();
		
		if(userChoice >= high)
		{
			high = userChoice;
			count = count + 1;
		}
		else if(userChoice <= low)
		{
			low = userChoice;
			count = count + 1;
		}
		else if(userChoice > 100 || userChoice < 0)

		{
			System.out.println("out of range");
		}
		total = total + userChoice;	
		average = total/count;
		  System.out.println("The best test score is " + high + " base on the total "+ total + " and the average test scores " + average);
			 System.out.println("The worse test score is " + low + " base on the total "+ total + " and the average test scores " + average);
	   }while(userChoice != 999); 
	 
	}

}
