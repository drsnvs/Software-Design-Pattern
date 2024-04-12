import java.util.ArrayList;
import java.util.List;

public class ConSub implements Subject{
	String msg;
	List<Observer> observers = new ArrayList<>();
	
	public void add(Observer observer){
		observers.add(observer);
	}
	public void remove(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyObservers(){
		for(Observer observer:observers){
			observer.update(msg);
		}
	}
	
	public void set(String msg){
		this.msg = msg;
		notifyObservers();
	}

}