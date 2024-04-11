public class Positive implements Handler{
	Handler next;
	public void setNext(Handler next){
		this.next = next;
	}
	public void handleReq(int number){
		if(number>0){
			System.out.println(number + " number is a positive number");
		}else{
			// System.out.println("Process through Positive");
			next.handleReq(number);
		}
	}
	
}