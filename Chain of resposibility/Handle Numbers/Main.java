public class Main{
	public static void main(String args[]){
		Handler positive = new Positive();
		Handler negative = new Negative();
		Handler zero = new Zero();
		positive.setNext(negative);
		negative.setNext(zero);
		
		positive.handleReq(5);
        positive.handleReq(-3);
        positive.handleReq(0);
	}
}