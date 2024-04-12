import java.util.Scanner;

class MainClass{
	public static void main(String args[]){
		int choice;
		Shape s;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("\nEnter Choice\n1.Create Circle:\n2.Create Rectangle:\n3.Create Square:\n4.Exit\nChoose one from both:");
			choice = sc.nextInt();
			
			s = ShapeFactory.getShape(choice);
			s.draw();
			s.fillcolor();
			
		}while(choice!=4);
	}
	
}