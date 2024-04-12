public class Client{
	public static void main(String args[]){
		Sandesh person1 = new Sandesh();
		Observer smn = new StockMarketNews();
		Observer kn = new KundaliNews();
		Observer en = new EconomicalNews();
		
		person1.register(smn);
		person1.register(kn);
		person1.register(en);
		
		person1.newNews("this is new news (1)");
		
		person1.deRegister(en);
		
		person1.newNews("this is new news(2)");
	}
}