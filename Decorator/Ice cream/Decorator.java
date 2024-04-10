abstract class Decorator implements IceCream{
	IceCream iceCream;
	public Decorator(IceCream iceCream){
		this.iceCream = iceCream;
	}
	
	public String getIcecream(){
		return iceCream.getIcecream();
	}
	
}