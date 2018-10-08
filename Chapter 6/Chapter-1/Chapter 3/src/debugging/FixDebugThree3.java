package debugging;
import java.util.Scanner;
public class FixDebugThree3 {

	public static void main(String[] args) 
	// TODO Auto-generated method stub

	{
		 String name = "Phero";
	      String getName;
		 
	      name = "Phero Luong";
	      Scanner input = new Scanner(System.in);
	     
	      displayGreeting(name); 
	   }
	   public static String getName()
	   {
	      String name;
	      
	      System.out.print("Enter name ");
	      Scanner input = null;
		name = input.nextLine();
	      return name;
	   }
	   public static void displayGreeting(String name)
	   {
		   int displayGreeting;
	      System.out.println("Hello, " + name + "!");
	}

}
