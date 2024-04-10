public class TaxFactory{
	public static Tax getTax(int choice,double amount){
		switch(choice){
			case 1:
				return new EducationTax(amount);
			case 2:
				return new VehicleTax(amount);
			case 3:
				return new RoadTax(amount);
			case 4:
				return new WaterTax(amount);
			case 5:
				return new ProfessionalTax(amount);
			case 6:
				return new PropertyTax(amount);
			case 7:
				System.exit(0);
			default:
				return null;
		}
	}
}