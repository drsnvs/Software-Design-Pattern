import java.sql.*;

public class SQLite implements Database{
	public boolean connection(){
		Connection con=null;
        boolean flag = false;
        try{
            Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite:D:\\Gujarat Vidhyapith 2023-24\\MCA-2\\Softwate Technology\\Factory\\Databse Task\\Database.db");
			
			if (con ==null){
				flag = false;
				// System.out.println("not connected");
			}else{
				flag = true;
				// System.out.println("connected");
			}
			con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
		return flag;
	}
}
