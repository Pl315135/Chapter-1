package GameZone;
import java.util.Scanner;
public class pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double payRate;
	double hoursWorked;
	int insuranceOption;
	int skillLevel;
	
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("what is your skill level? >>");
	 skillLevel = input.nextInt();
	 
	 
	 System.out.println("How may hours did you work? >>");
	 hoursWorked = input.nextInt();
	 
	 if(skillLevel == 1)
	 {
	 insuranceOption = 0;
	 payRate = 17;
	 displayTotalPay(hoursWorked, insuranceOption, payRate);
	 
	}

}
