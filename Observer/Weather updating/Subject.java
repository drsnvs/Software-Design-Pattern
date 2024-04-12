public interface Subject{
	public void register(Observer observer);
	public void deRegister(Observer observer);
	public void notifyOb();
}