public class SeatCover extends ToyotoDecorator{
	SeatCover(Car car){
		super(car);
	}
	public String getCar(){
		return super.getCar()+" with cover";
	}
}