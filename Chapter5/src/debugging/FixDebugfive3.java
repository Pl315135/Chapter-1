		package debugging;
		import java.util.Scanner;
		public class FixDebugfive3 {
		
			private static final int LOW = 0;
			private static final int HIGH = 0;
			private static final int CUTOFF = 0;
			public static void main(String[] args) 
			// TODO Auto-generated method stub
			{
				int item;
			      String output;
			      final int LOW = 111;
			      final int HIGH = 9;
			      final int CUTOFF = 500;
			      Scanner input = new Scanner(System.in);
			      calculateOutPut();
			   }
			   public static void calculateOutPut()
			   {
			           
			      System.out.println("Please enter item number");
			      Scanner input = null;
				int item = input.nextInt();
			      String output;
				if(item < LOW) 
			      {
			    	  output = "Item number too low";
			      }
			  else if(item > HIGH)
			{
				output = "Item number too high";
			}
			
				
			else if(item > CUTOFF)
			{
				output = "Valid - in Automotive Department";
			}
			             
			          else
			          {
			        	  output = "Valid - Item in Housewares Department";
			          }
			       
			             System.out.println(output);	
				
		
			}
		
		}
