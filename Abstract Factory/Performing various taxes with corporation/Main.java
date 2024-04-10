import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		AbFactory abFactory;
		PropertyTax p;
		WaterTax w;
		int opt,cor;
		double amt;
		System.out.println("\nSelect Corporation");
        System.out.println("1.AMC");
        System.out.println("2.VMC");
        System.out.print("Enter your choice: ");
        cor = sc.nextInt();
		
		//do{
			
			System.out.println("\nSelect Tax");
			System.out.println("1.PropertyTax");
			System.out.println("2.WaterTax");
			System.out.print("Enter your choise: ");
			opt=sc.nextInt();
			
			switch(opt){
				case 1: 
					System.out.print("\nValue of your property: ");
					amt=sc.nextDouble();
					
					abFactory = AbFactory.selCorporation(cor); 
					p = abFactory.getPTax(); 
					System.out.println("\nTax amount : " + p.getPTax(amt)); 
					break;
				case 2:
					System.out.print("\nUsage of your Water: ");
					amt=sc.nextDouble();
					
					abFactory = AbFactory.selCorporation(cor);
					w = abFactory.getWTax(); 
					System.out.println("\nTax amount " + w.getWTax(amt));
					break;
				case 3: 
					System.exit(0);
					break;
				default:
					System.out.println("wrong choise");		 
				
				}
			 
			//}while(opt!=3);
		}
}