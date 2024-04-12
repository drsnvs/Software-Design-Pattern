public class Client{
	public static void main(String args[]){
		WeatherUpdate weatherUpdate = new WeatherUpdate();
		Observer tv = new TV();
		Observer mobile = new Mobile();
		
		weatherUpdate.register(tv);
		weatherUpdate.register(mobile);
		
		weatherUpdate.setWeather("Sunny");
	}
}