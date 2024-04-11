public class ProxyMeeting implements Office{
	GeneralMeeting generalMeeting;
	String message="";
	String username="";
	String password="";
	public ProxyMeeting(String username,String password,String message){
		this.message= message;
		this.username = username;
		this.password = password;
	}
	
	private boolean authenticate(){
		return "admin".equals(username) && "1234".equals(password);
	}
	
	public void message(){
		if(authenticate()){
			if(generalMeeting == null){
				generalMeeting = new GeneralMeeting(message);
			}
			generalMeeting.message();
		}else{
			System.out.println("Not authenticate");
		}
	}
}