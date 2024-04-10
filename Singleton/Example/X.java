public class X{
	static X x;
	private X(){
		System.out.println("X is created");
	}
	public static X getX(){
		if(x == null){
			x = new X();
		}
		return x;
	}
}
