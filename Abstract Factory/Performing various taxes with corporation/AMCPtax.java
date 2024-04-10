public class AMCPtax implements PropertyTax{
	public double getPTax(double value){
		double rate = 1.5;
		return ((value*rate)/100);
	}
}