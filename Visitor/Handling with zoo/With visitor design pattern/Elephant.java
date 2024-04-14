public class Elephant implements Animal{
	void accept(AnimalVisitor animalVisitor){
		animalVisitor.visit(this);
	}
}