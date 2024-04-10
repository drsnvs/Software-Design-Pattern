public class VMC implements AbFactory{
	int choice;
	
	public PropertyTax getPTax(){
		PropertyTax p=new VMCPtax();
		return p;
	}
	public WaterTax getWTax(){
		WaterTax w = new VMCWtax();
		return w;
	}
}