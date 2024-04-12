public class DBFactory{
	public static Database getConnection(int choice){
		switch(choice){
			case 1:
				return new MysqlDB();
			case 2:
				return new PsgDB();
			case 3:
				return new SQLite();
			default:
				return null;
		}
	}
}