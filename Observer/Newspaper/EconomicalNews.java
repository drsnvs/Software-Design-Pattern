public class EconomicalNews implements Observer{
	String msg="";
	public void update(String msg){
		this.msg = msg;
		System.out.println("New Economical news: "+msg);
	}
}