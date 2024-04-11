import java.io.*;

public class Student implements ManageFiles{
	Admin admin;
	String username="";
	String password="";
	public Student(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	public boolean authenticate(){
		return username.equals("student") && password.equals("Tuesday");
	}
	
	public void copy(){
		if(authenticate()){
			if(admin == null){
				admin = new Admin();
			}
			admin.copy();
		}else{
			System.out.println("Not authenticate Student");
		}
	}
}