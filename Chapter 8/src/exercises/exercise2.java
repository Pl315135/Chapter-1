package exercises;
import java.util.Scanner;
public class exercise2 {
	
	private static final String Scanner = null;

	public static void main(String[] args)
	// TODO Auto-generated method stub

	{
		double[] arrayNums = new double [20];
		double total = 0;
		double average = 0;
		int i = 0;
		int quit = 0;
		Scanner input = new Scanner(System.in);
		
		while(quit != 9999)
		{
			System.out.println("Enter a number:");
			arrayNums[i] =  input.nextDouble();
			
			total = total + arrayNums[i];
			average = total / arrayNums[i];
			System.out.println("Another number to continue or type the number 9999 to quit");
			quit = input.nextInt();
			i++;
		}
		System.out.println("The average is " + average);
		System.out.println("The total is " + total);
		
	}

}
