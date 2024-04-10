public class Penuts extends Decorator{
	IceCream iceCream;
	public Penuts(IceCream iceCream){
		super(iceCream);
	}
	
	public String getIcecream(){
		return super.getIcecream() + " Penuts";
	}
}