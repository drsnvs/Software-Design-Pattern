public class EducationTax implements Tax{
	double amount;
	EducationTax(double amount){
		this.amount = amount;
	}
	public double calculateTax(){
		return (amount * 2)/100;
	}
}