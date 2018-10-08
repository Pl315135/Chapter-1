package Chapter2exercises;
import java.util.Scanner;
public class QuartstoGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int QTS_IN_GALLONS = 4;
		int numberofQuartsNeeded = 18;
		int numberofGallons;
		int numberofQuartsRemaining;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many quarts are needed ? ");
		numberofQuartsNeeded = input. nextInt();
		
		numberofGallons = numberofQuartsNeeded / QTS_IN_GALLONS;
		numberofQuartsRemaining = numberofQuartsNeeded % QTS_IN_GALLONS;
		
System.out.println("This job needs " + numberofQuartsNeeded + " quarts");
System.out.println("A job thats needed " + numberofQuartsNeeded + " quarts requires "
		+ numberofGallons + " gallons plus " + numberofQuartsRemaining + " quarts. ");
		
		
				
	}

}
