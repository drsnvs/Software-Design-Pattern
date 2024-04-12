public class Circle implements Shape{
	String color;
	Circle(String color){
		this.color = color;
	}
	// private String color;
	public void draw(){
		System.out.println("\nDrawing Circle");
	}
	public void fillcolor(){
		this.color = color;
		System.out.println("\nfill the color in Circle: "+color);
	}
}