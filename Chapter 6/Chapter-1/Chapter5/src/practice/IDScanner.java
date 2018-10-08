	package practice;
	import java.util.Scanner;
	public class IDScanner  {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int idNumber;
	String result;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Scan the bar code to find the  person >>");
	idNumber = input.nextInt();
	
	switch(idNumber)
	{
	
	case 315135:
		result ="Phero Luong/n";
	break;
	
	case 316338:
		result ="Logan DeWilfond/n";
	break;
	
	case 155706:
		result ="Joseph Chalupa/n";
	break;
	

	case 137122:
		result ="Adam Burton/n";
	break;
	
	
	case 137160:
		result ="Zach Canada/n";
	break;

	case 153184:
		result ="Jayden Grapp/n";
	break;
	
	case 159343:
		result ="Giovanni Jacobson/n";
	break;
	
	
	case 129001:
		result ="Issac Dibbern/n";
	break;
	
	
	case 274871:
		result ="Tavius Sterling/n";
	break;
	
	
	case 153182:
		result ="Orion Gardner/n";
	break;
	
	
	case 274904:
		result ="Amia Combs/n";
	break;
	
	
	case 304345:
		result ="Cheyenne Jones/n";
	break;
	
	
	case 274894:
		result ="John Brosius/n";
	break;
	
	
	case 118314:
		result ="Ben Brooks/n";
	break;
	
	
	case 146891:
		result ="De'Antwan Hanes/n";
	break;
	
	
	case 146468:
		result ="Noah Giles/n";
	break;
	
	case 274888:
		result ="Travis Hodges/n";
	break;
	
	default:
		result = "not available";
	
	System.out.println(result);
	}
		}
	}
	
	
	
	
	
	
