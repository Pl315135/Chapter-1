package Chapter2exercises;
import java.util.Scanner;
public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int INCHES_TO_FEET = 12;
int numberofInches = 86;
int numberofFeet;
int total;

Scanner input = new Scanner(System.in);

System.out.println("How many inches ?");
numberofInches = input. nextInt();

numberofFeet =numberofInches  / INCHES_TO_FEET;
total = numberofInches % INCHES_TO_FEET;

System.out.println("The number of feet is " + numberofFeet );
System.out.println("The total of feet to inches is " + total);
	}

}
