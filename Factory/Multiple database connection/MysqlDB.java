import java.sql.*;

public class MysqlDB implements Database{
	public boolean connection(){
		Connection con=null;
        boolean flag = false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/darshan_14","root","");
			
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
