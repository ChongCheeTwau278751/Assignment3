import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hi = {"Welcome", "To", "The", "Bakery", "House!"};
		display(hi);//Java Method
		
	}
	public static void display(String[] input) { //Passing java to method
		for(int counter = 0; counter < input.length; counter++) {
			System.out.println(input[counter]);
		}	
		
		
		String name, fm, ages;
		int  num1, num2, num3, num4, num5, num6, ans;
		long IC;
		double sum;
		char answer;
	
		
		boolean running = true;
		System.out.println("Start your great day with a fresh baked bread!");
		Scanner in = new Scanner (System.in);
		
		System.out.println("\n\tWould you like to buy breads?");
		System.out.println("\t1. Yes Of Course!");
		System.out.println("\t2. No Bye-bye!");
			
		
		String input1 = in.nextLine();
		if(!input1.equals("1") && !input1.equals("2")) {
			System.out.println("Invalid Command");
			input1 = in.nextLine();
		
		}else if(input1.equals("1")) {
        	 do {//do while loop
			System.out.println("Welcome to The Bakery House!");
		
		
		
		//1.
		System.out.println("What is your name?");
		name = in.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println("How old are you?");
		ages = in.nextLine();
		System.out.println("You are " + ages +" years old!");
		//System.out.print("Enter your IC number: ");
		//IC = in.nextLong();
		System.out.println("Enter your gender :");
		fm = in.nextLine();
		System.out.println();
		
		//do while loop
		System.out.println("Please check your data again!");
		String[] data1 = {"Name", "Age", "Gender"};
		String[] data2 = {name, ages, fm};
		int i=0;
		do {
			System.out.println(data1[i] + "\t: " + data2[i]);
			i++;
		}while(i<data1.length);

		System.out.println();
		
		
		//2.&3.
		//System.out.println("Product provided(per one quantity): ");
		//System.out.println("White bread 	  = RM  5.00");
		//System.out.println("Wheat bread 	  = RM  7.00");
		//System.out.println("Whole Grain bread = RM  9.00");
		//System.out.println("Rye Bread 	  = RM  3.00");
		//System.out.println("French Bread 	  = RM 10.00");
		//System.out.println("Hot-Dog Bread 	  = RM 13.00");
		//System.out.println();
		//System.out.print("Please enter the code of product required: ");
		
		
		//For loop & Array
		//System.out.println("Product we provide with the price!");
		//String[] breads = {"White bread		= RM5.00", "Wheat bread 		= RM7.00", "Whole Grain bread  	= RM9.00", "Rye Bread		= RM3.00", "French Bread		= RM10.00", "Hot-Dog Bread		= RM13.00"};
		//for (String j : breads) {
		//	System.out.println(j);
		//}
		//System.out.println();	
		
		//For loop & Array
		System.out.println("Product we provide with the price!");
		String[] breads = new String[6];
		breads[0] = "White bread		= RM5.00";
		breads[1] = "Wheat bread 		= RM7.00";
		breads[2] = "Whole Grain bread  	= RM9.00";
		breads[3] = "Rye Bread		= RM3.00";
		breads[4] = "French Bread		= RM10.00";
		breads[5] = "Hot-Dog Bread		= RM13.00";
		for(int j=0; j<breads.length; j++){
				System.out.println(breads[j]);
		}
		System.out.println();	
		
		//4.
		System.out.println("Quantity of Item wanted: ");
		//integer1 = sc.nextInt();
		System.out.print("White Bread		=");
		num1 = in.nextInt();
		System.out.print("Wheat Bread 		=");
		num2 = in.nextInt();
		System.out.print("Whole Grain Bread  	=");
		num3 = in.nextInt();
		System.out.print("Rye Bread		=");
		num4 = in.nextInt();
		System.out.print("French Bread		=");
		num5 = in.nextInt();
		System.out.print("Hot-Dog Bread		=");
		num6 = in.nextInt();
		System.out.println();

		
		System.out.println();
		
		//5.
		 sum = ((num1*5) + (num2*7) + (num3*9) + (num4*3) + (num5*10) + (num6*13));
		 
			System.out.println("Total Price: RM " + sum);
			
			if (sum > 100) {
				System.out.println("Discount : RM" + sum*0.20);
				System.out.println("Price need to be paid : RM" + (sum-(sum*0.20)));
			}else if (sum < 100) {
				System.out.println("No Discount for this purchase!");
				System.out.println("Price need to be paid : RM " + sum);
			}
				System.out.println();
					
			
			System.out.println("Please rate our service / shop quality!");
			System.out.println("Please enter either of the three rates below!");
			System.out.println("Excellent!(1)");
			System.out.println("Good!(2)");
			System.out.println("Still have room of improvement!(3)");
			
			//while loop
			String rate1 = in.next();
			String[] rating = {rate1};
			int k = 0;
			//while (k<rating.length) {
				while(!rate1.equals("1") && !rate1.equals("2") && !rate1.equals("3")) {
					System.out.println("I have no idea!Good Bye!");
					rate1 = in.nextLine();
				}
				if (rate1.equals("1")) {
				System.out.println("I think the service / shop quality of The Bakery House is excellent!");
				}
				else if(rate1.equals("2")) {
					System.out.println("I think the service / shop quality of The Bakery House is good!");
				}
				else if(rate1.equals("3")) {
					System.out.println("I think the service / shop quality of The Bakery House is still have room of improvement!");
					break;
				}
				System.out.println("Do you want to shop again?(Y/y or N/n)");
				answer = in.next().charAt(0);
		}while(answer == 'y' || answer == 'Y');
			
			}else if(input1.equals("2")) {
				System.out.println("Bye-bye! Have a good day!");
			
			
	}
		
			}
	}
	


