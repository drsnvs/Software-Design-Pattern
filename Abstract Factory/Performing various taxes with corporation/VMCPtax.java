public class VMCPtax implements PropertyTax{
	public double getPTax(double value){
		double rate = 1.2;
		return ((value*rate)/100);
	}
}