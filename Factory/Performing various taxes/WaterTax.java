public class WaterTax implements Tax{
	double amount;
	WaterTax(double amount){
		this.amount = amount;
	}
	public double calculateTax(){
		return (amount * 18)/100;
	}
}