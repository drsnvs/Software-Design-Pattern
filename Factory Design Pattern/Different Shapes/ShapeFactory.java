class ShapeFactory{
	public static Shape getShape(int i){
		// int choice;
		// Scanner sc = new Scanner(System.in);
		// do{
			// System.out.print("\nEnter Choice\n1.Create Circle:\n2.Create Rectangle:\n3.Exit\nChoose one from both:");
			// choice = sc.nextInt();
			switch(i){
				case 1:
				
					// Shape c= new Circle();
					return new Circle("Red");
					// return c;
					// circle.fillcolor("Blue");
					// circle.draw();
					// break;
				case 2:
					// Shape r = new Rectangle();
					return new Rectangle("Blue");
					// return r;
					// rectangle.fillcolor("Red");
					// rectangle.draw();
					// break;
				case 3:
					return new Square("Black");
				case 4:
					System.exit(0);
				default:
					return null;
					// System.out.println("\nEnter Valid choice\n");
			}
		// }while(choice!=3);
	}
}