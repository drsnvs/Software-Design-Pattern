public abstract class ToyotoDecorator implements Car{
	Car car;
	ToyotoDecorator(Car car){
		this.car = car;
	}
	public String getCar(){
		return car.getCar();
	}
}