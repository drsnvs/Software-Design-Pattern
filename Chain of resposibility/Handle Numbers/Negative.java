public class Negative implements Handler{
	Handler next;
	public void setNext(Handler next){
		this.next = next;
	}
	public void handleReq(int number){
		if(number<0){
			System.out.println(number + " number is a negative number");
		}else{
			// System.out.println("Process through Negative");
			next.handleReq(number);
		}
	}
	
}