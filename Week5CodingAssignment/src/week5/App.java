package week5;

public class App {

	public static void main(String[] args) {

		Logger astLog = new AsteriskLogger();
		Logger spaLog = new SpacedLogger();
		
		astLog.log("Spaghooti");
		System.out.println();
		
		astLog.error("Whomples");
		System.out.println();
		
		spaLog.log("Scudzo");
		System.out.println();
		
		spaLog.error("Whuddaheck?");
		
		
	}

}
