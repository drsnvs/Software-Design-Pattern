import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("\n1.Open Notepade\n2.Exit\nEnter your choice: ");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					Notepad.getInstance();
					break;
				case 2:
					System.exit(0);
				default:
					System.out.println("\nEnter valid choice");
			}
		}while(choice!=2);
    }
}
