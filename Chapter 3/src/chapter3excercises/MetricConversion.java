package chapter3excercises;
import java.util.Scanner;
public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double cM;
int inch;

Scanner input = new Scanner(System.in);	

System.out.println("Enter a number : ");
cM = input.nextDouble();
System.out.println("Enter a second number :");
inch=input.nextInt();

metricConversion(cM,inch);
	}
public static void metricConversion(double cM,
		int inch) {
	double mC;
	
	mC = 2.54 / inch;
	 
	System.out.println("There are " + mC + " centimeters in an inch");
	
}
public static void litersConversion() {
	
	double liters;
	int usGallons;
	
	System.out.println("Enter a number : ");
	liters = input.nextDouble();
	System.out.println("Enter a second number :");
	usGallons=input.nextInt();
	
}

}
