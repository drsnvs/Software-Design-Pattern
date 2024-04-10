public class Main{
	public static void main(String args[]){
		Toyoto toyoto = new Toyoto();
		System.out.println(toyoto.getCar());
		
		Car c1 = new SeatCover(new Toyoto());
		System.out.println(c1.getCar());
		
		
		Car c2 = new SeatCover(new SeatCover(new Toyoto()));
		System.out.println(c2.getCar());
		}
}