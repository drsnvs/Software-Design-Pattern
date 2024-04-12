public class VehicleTax implements Tax{
	double amount;
	VehicleTax(double amount){
		this.amount = amount;
	}
	public double calculateTax(){
		return (amount * 6)/100;
	}
}