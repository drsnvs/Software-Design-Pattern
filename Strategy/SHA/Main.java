import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter String:");
		// s = sc.next();
		String s = "GujaratVidyapith";
		int c=0;
		ContextClass cs = new ContextClass(new SHA());
		do{
			System.out.print("\n1.SHA256\n2.MD5\n3.SHA-1\n4.Exit\nEnter your choice:");
			while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); 
            }
			c = sc.nextInt();
			switch(c){
				case 1:
				cs.encode(s);
				break;
				
				case 2:
				cs.setStrategy(new MD5());
				cs.encode(s);
				break;
				
				case 3:
				cs.setStrategy(new SHA1());
				cs.encode(s);
				break;
				
				case 4:
				System.exit(0);
				
				default:
				System.out.println("\nEnter valid choice");
			}
		}while(c!=4);
	}
}