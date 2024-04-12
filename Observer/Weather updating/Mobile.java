public class Mobile implements Observer{
	public String msg;
	public void update(String msg){
		this.msg = msg;
		System.out.println("Weather Updated "+msg);
	}
}