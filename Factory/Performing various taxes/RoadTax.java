public class RoadTax implements Tax{
	double amount;
	RoadTax(double amount){
		this.amount = amount;
	}
	public double calculateTax(){
		return (amount * 6)/100;
	}
}