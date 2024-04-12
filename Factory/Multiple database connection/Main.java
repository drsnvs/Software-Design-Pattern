import java.sql.*;
import java.util.Scanner;
// javac -cp .;mysql-connector-java-5.1.40-bin.jar;postgresql-42.5.3.jar;sqlite-jdbc-3.40.0.0.jar Main.java
public class Main {
    public static void main(String args[]){
        Database db;
		int choice;
		Scanner sc = new Scanner(System.in);
        try{
			do{
				System.out.print("Select Database:\n1.Mysql\n2.postgresql\n3.SQLite\n4.Exit\nEnter your choice:");
				choice = sc.nextInt();
				if(choice == 1){
					System.out.print("\nMysql Connection: ");
				}if(choice == 2){
					System.out.print("\npostgresql Connection: ");
				}if(choice == 3){
					System.out.print("\nSQLite Connection: ");
				}
				db = DBFactory.getConnection(choice);
				System.out.println(db.connection()+"\n");
			}while(choice!=4);
        }catch(Exception e){
            System.out.println("Hello");
            e.printStackTrace();
        }
        
        
    }
}
