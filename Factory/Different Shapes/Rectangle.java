class Rectangle implements Shape{
	String color;
	Rectangle(String color){
		this.color = color;
	}
	public void draw(){
		System.out.println("\nDrawing Rectangle");
	}
	public void fillcolor(){
		this.color = color;
		System.out.println("\nfill color in Rectangle: "+color);
	}
}