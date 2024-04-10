public class AMCWtax implements WaterTax{
	public double getWTax(double usage){
		double rate = 0.7;
		return ((usage*rate)/100);
	}
}