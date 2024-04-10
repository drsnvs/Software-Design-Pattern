public class Square implements Shape{
	String color;
	Square(String color){
		this.color = color;
	}
	// private String color;
	public void draw(){
		System.out.println("\nDrawing Square");
	}
	public void fillcolor(){
		this.color = color;
		System.out.println("\nfill the color in Square: "+color);
	}
}