public interface Handler{
	public void setNext(Handler next);
	public void handleReq(int number);
}