public class SetupFacade{
	CPU cpu;
	Monitor monitor;
	Keyboard keyboard;
	
	public SetupFacade(){
		this.cpu = new CPU();
		this.monitor = new Monitor();
		this.keyboard = new Keyboard();
	}
	
	public void setCPU(){
		System.out.println(cpu.run());
	}
	
	public void setMonitor(){
		System.out.println(monitor.run());
	}
	
	public void setKeyboard(){
		System.out.println(keyboard.run());
	}
	
	// public void setUp(){
		// System.out.println(cpu.run());
		// System.out.println(monitor.run());
		// System.out.println(keyboard.run());
		// System.out.println("Done");
	// }
}