public class AMC implements AbFactory{
	int choice;
	
	public PropertyTax getPTax(){
		PropertyTax p=new AMCPtax();
		return p;
	}
	public WaterTax getWTax(){
		WaterTax w = new AMCWtax();
		return w;
	}
}