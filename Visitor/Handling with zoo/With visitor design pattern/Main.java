public class Main{
	public static void main(String args[]){
		Lion lion = new Lion();
		lion.accept(new FeedVisitor());
	}
}