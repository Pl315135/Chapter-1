package chapter3excercises;
import java.util.Scanner;
public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String name;
		double gpa;
		
		 Scanner input = new Scanner(System.in);	
		
		 
		  System.out.println("Enter your name:");
		  name = input.nextLine();
		  System.out.println("Enter your GPA");
		  gpa = input.nextDouble();
		
		  System.out.println("Student Name : " + name);
		System.out.println("Student GPA : " + gpa);
		 
		bookstoreCredit(name,gpa);
		
	}
		  public static void bookstoreCredit(String name,double gpa) {
			  double credit;
			  
			  credit = gpa * 10;
			  
			  System.out.println("Bookstore Credit =" + credit);
	
	}

}
