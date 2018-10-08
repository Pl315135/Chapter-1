package chapter3excercises;
import java.util.Scanner;
public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double cM;
int inch;
int usG = 0;
double lit = 3.7854;
Scanner input = new Scanner(System.in);	

System.out.println("Enter a number : ");
cM = input.nextDouble();
System.out.println("Enter a second number :");
inch=input.nextInt();
System.out.println("Enter a number : ");
lit = input.nextDouble();
System.out.println("Enter a second number :");
usG=input.nextInt();

metricConversion(cM,inch);
litersConversion(lit,usG);
	}
public static void metricConversion(double cM,
		int inch) {
	double mC;
	
	mC = 2.54 / inch;
	 
	System.out.println("There are " + mC + " centimeters in an inch");
	
	
}
public static void litersConversion(double lit, int usG) 
{
	double litersC;
	
	litersC = 3.7854 / usG;
	
	System.out.println("There are " + litersC+ " liters in a gallon");

	
}

}
