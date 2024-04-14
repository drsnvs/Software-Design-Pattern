public class Lion implements Animal{
	void accept(AnimalVisitor animalVisitor){
		animalVisitor.visit(this);
	}
}