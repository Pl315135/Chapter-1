package chapter3exercises;

public class practice {

	public static void main(String[] args) {
// TODO Auto-generated method stub

int x;
int y;

System.out.println("Enter a number >> ");
	}
	
public static void displayTwiceTheNumber(int x, int y) {
	
	int x2;
	int y2;
	displayTwiceTheNumber(x,y);
	x2 = x * 2;
	y2 = y * 2;
	System.out.println("x *2 = " + x2  +"y * 2 = " + y2);
}
public static void displayNumberPlusFive(int x, int y) {
	int x5 = + 5;
	int y5 = + 5;
	displayNumberPlusFive(x,y);
	x5 = x + 5;
	y5 = y + 5;
	
	System.out.println("x + 5 = " + x5  + " y + 5 = " + y5);
	
}
public static void displayNumberSquared(int x, int y) {
	int x2;
	int y2;
	
	x2 = x * x;
	y2 = y * y;
	System.out.println("x * x = " + x2 + "y * y = " + y2);
	
	
}
}
