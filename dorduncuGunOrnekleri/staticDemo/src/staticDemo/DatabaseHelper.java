package staticDemo;

public class DatabaseHelper {
	//NOT: SOLID'e aykırı, birden fazla sorumluluk tek sınıfa yüklenmemeli.
	public static class Crud{ //CRUD -> CREATE READ UPDATE DELETE
		public static void delete() {
			
		}
		
		public static void update() {
			
		}
	}
	
	public static class Connection{
		public static void createConnection() {
			
		}
	}
}
