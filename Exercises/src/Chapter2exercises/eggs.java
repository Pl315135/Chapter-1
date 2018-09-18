package Chapter2exercises;
import java.util.Scanner;
public class eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dozenEggs;
int singleEgg;
double dozenEggCost = 3.25;
double singleEggCost = 0.45;
int eggsTotal;
double eggsCost;

Scanner input = new Scanner(System.in);

System.out.println("How many eggs do you want to order ? ");
eggsTotal = input. nextInt();

dozenEggs = eggsTotal / 12;
singleEgg = eggsTotal % 12;

eggsCost = dozenEggs * dozenEggCost + singleEgg * singleEggCost;

System.out.println(" You ordered " + eggsTotal + " Eggs. Thats "
		+ dozenEggs + "dozen eggs at " + dozenEggCost + "per dozen and " + singleEgg +
		"loose eggs at " + singleEggCost + "cents each for a total of "
		+ eggsCost + ".");
		




	}

}
