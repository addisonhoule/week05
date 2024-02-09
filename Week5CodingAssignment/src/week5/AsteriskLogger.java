package week5;

public class AsteriskLogger implements Logger {

	//implemented Logger interface
	//log needs leading and trailing asterisks to print out.
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	//error needs a box of asterisks around the error with "Error: " before input
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("*********************");
		System.out.println("***Error: " + error + "***");
		System.out.println("*********************");
	}

	//this will use asterisks to print out strings
	
	
	
}
