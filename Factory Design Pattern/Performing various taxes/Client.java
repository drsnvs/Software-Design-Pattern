import java.util.Scanner;

public class Client{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double amount;
		int select;
		Tax calculation;
		System.out.print("Enter Amount for tax calculation: ");
		amount = sc.nextDouble();
		do{
			System.out.print("\nChoice from here:\n1.Education Tax\n2.Vehicle Tax\n3.RoadTax\n4.WaterTax\n5.ProfessionTax\n6.PropertyTax\n7.Exit\nEnter your choice:");
			select = sc.nextInt();
			calculation = TaxFactory.getTax(select,amount);
			System.out.println(calculation.calculateTax());
		}while(select!=7);
	}
}