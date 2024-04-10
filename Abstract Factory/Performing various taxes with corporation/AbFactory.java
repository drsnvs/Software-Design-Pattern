public interface AbFactory{
	public static AbFactory selCorporation(int choice){
		switch(choice){
			case 1:
				return new AMC();
			case 2:
				return new VMC();
			default:
				return null;
		}
	}
	public PropertyTax getPTax();
	public WaterTax getWTax();
}