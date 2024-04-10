public class VMCWtax implements WaterTax{
	public double getWTax(double usage){
		double rate = 0.5;
		return ((usage*rate)/100);
	}
}