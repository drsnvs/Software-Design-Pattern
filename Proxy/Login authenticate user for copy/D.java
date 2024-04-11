import java.io.*;
import java.util.Scanner;

public class D{
	public static boolean isValidString(String str) {
		// Regular expression to match string format (alphabets only)
		String regex = "^[a-zA-Z]+$";
		return str.matches(regex);
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String username = "";
		String password = "";
		System.out.println("\n\nWelcome to My program");
		System.out.println("\nNeed to login for the access and copy of your files:");
		
		while (true) {
            System.out.print("Enter username: ");
            username = sc.next();
            if (isValidString(username)) {
                break;
            } else {
                System.out.println("enter valid formate in username");
            }
        }
		
		while (true) {
            System.out.print("Enter password: ");
            password = sc.next();
            if (isValidString(password)) {
                break;
            } else {
                System.out.println("enter valid formate in password");
            }
        }
		System.out.print("\n");
		
		

		
		ManageFiles manage = new Student(username,password);
		manage.copy();
		
		
		
		// try{
			// File file = new File("darshan.txt");
			// if(file.createNewFile()){
				// System.out.println("File created : "+file.getName());
			// }else{
				// System.out.println("File already created : "+file.getName());
			// }
		// }catch(Exception e){
			// e.printStackTrace();
		// }
		
		// FileInputStream fis = null;
		// FileOutputStream fos = null;
		// try{
			// fis = new FileInputStream("darshan.txt");
			// fos = new FileOutputStream("copy.txt");
			// File file = new File("copy.txt");
			// int c;
			// while((c = fis.read()) != -1){
				// fos.write(c);
			// }
			// System.out.println("File Copied Successfully : "+file.getName());
			
		// }catch(Exception e){
			// e.printStackTrace();
		// }
		
		// try {
			// File fileOld = new File("copy.txt");
			// // File fileNew = new File("D:\\Gujarat Vidhyapith 2023-24\\MCA-2\\Softwate Technology\\Proxy\\Example\\rename.txt");
			// File fileNew = new File("rename.txt");
			
			// boolean flag = fileOld.renameTo(fileNew);
			
			// if (flag) {
				// System.out.println("File Successfully Renamed: " + fileOld.getName() + " -> " + fileNew.getName());
			// } else {
				// System.out.println("File cannot be renamed");
			// }
		// } catch (Exception e) {
			// e.printStackTrace();
		// }

	}
}