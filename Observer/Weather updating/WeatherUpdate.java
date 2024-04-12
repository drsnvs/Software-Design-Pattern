import java.util.*;

public class WeatherUpdate implements Subject{
	String msg = "";
	public List<Observer> observers = new ArrayList<>();
	
	public void register(Observer observer){
		observers.add(observer);
	}
	public void deRegister(Observer observer){
		observers.remove(observer);
	}
	public void notifyOb(){
		for(Observer observer:observers){
			observer.update(msg);
		}
	}
	public void setWeather(String msg){
		this.msg = msg;
		notifyOb();
	}
}