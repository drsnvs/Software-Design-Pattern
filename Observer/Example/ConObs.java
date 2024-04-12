public class ConObs implements Observer{
	String msg;
	public void update(String msg){
		this.msg = msg;
		System.out.println("New Message: "+msg);
	}

}