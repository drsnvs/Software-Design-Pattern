public class Main{
	public static void main(String args[]){
		ConSub conSub = new ConSub();
		
		Observer first = new ConObs();
		Observer second = new ConObs();
		
		conSub.add(first);
		conSub.add(second);
		
		conSub.set("Just a second ago");
	}
}