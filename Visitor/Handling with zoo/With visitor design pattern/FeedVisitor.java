public class FeedVisitor implements AnimalVisitor{
	void visit(Elephant elephant){
		System.out.println("feeding elephant");
	}
	void visit(Lion lion){
		System.out.println("feeding lion");
	}
}