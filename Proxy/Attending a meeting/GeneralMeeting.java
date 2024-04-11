public class GeneralMeeting implements Office{
	private String message;
	public GeneralMeeting(String message){
		this.message = message;
		System.out.println("HOD receiving this meeting and message: "+message);
	}
	public void message(){
		System.out.println("General Meeting running");
	}
}