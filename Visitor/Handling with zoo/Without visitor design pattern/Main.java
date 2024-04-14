class Main{
	public static void main(String args[]){
		Lion lion = new Lion();
		Elephant elephant = new Elephant();
		
		System.out.println(lion.feed());
		System.out.println(lion.getWeight());
		System.out.println(elephant.feed());
		System.out.println(elephant.getWeight());
	}
}