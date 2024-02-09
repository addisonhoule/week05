package week5;

public class SpacedLogger implements Logger {

	// implemented Logger interface.
	// log needs spaces between each letter.

	@Override
	public void log(String log) {
		
		//first attempt at making spaces between.
//		int i = 0;
//		StringBuilder temp = new StringBuilder();
//
//		if (i < log.length() - 1) {
//			temp.append(log.charAt(i) + " ");
//			i++;
//		} else if (i == log.length() - 1) {
//			temp.append(log.charAt(i));
//		} else {
//			System.out.println(temp);
//		}

		//thanks stackoverflow.com for this nifty trick...
		System.out.println(log.replace("", " ").trim());
	}

	// error needs to print out "Error: " plus error String with spaces between.

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub

		//first attempt that did not work...
//		int i = 0;
//		StringBuilder temp = new StringBuilder();
//		if (i < error.length() - 1) {
//			temp.append(error.charAt(i) + " ");
//			i++;
//		} else if (i == error.length() - 1) {
//			temp.append(error.charAt(i));
//			i++;
//		} else {
//		System.out.println("Error: " + temp);
//
//		}
		//thanks also to google for directing me to stackoverflows.com for this solution.
		System.out.println("Error: " + error.replace("", " ").trim());

	}

}
