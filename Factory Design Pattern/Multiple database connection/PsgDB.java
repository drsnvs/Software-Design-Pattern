import java.sql.*;

public class PsgDB implements Database{
	public boolean connection(){
		Connection con=null;
        boolean flag = false;
        try{
            Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/darshan_14","postgres","darshan");
			
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
