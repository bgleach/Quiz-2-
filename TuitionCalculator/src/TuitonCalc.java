import java.util.Scanner;


public class TuitonCalc {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double initialCost = 0;
		double percentInc = 0;
		double totalCost = 0;
		
		System.out.println("Initial tuition cost?");
		initialCost = scan.nextDouble();

		System.out.println("Percentage increase in tuition?");
		percentInc = scan.nextDouble()/100; 
		
		totalCost = initialCost; 

		double cost = initialCost; 
		
		for (int i = 0; i < 3; i++) {
			cost = (cost + percentInc*cost);
			totalCost = (cost + totalCost);
		}
		
		System.out.println("Cost of tuition:");		
		System.out.println(totalCost);
		
	}

}