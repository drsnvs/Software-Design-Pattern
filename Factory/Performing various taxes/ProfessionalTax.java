public class ProfessionalTax implements Tax{
	double amount;
	ProfessionalTax(double amount){
		this.amount = amount;
	}
	public double calculateTax(){
		if (amount>12000){
			amount = 200;
		}else{
			amount = 0;
		}
		return amount;
	}
}