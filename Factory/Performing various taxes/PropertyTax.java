public class PropertyTax implements Tax{
	double amount;
	PropertyTax(double amount){
		this.amount = amount;
	}
	public double calculateTax(){
		return (amount * 10)/100;
	}
}