package Main;

import java.util.Scanner;

public class Main {
	private static Scanner s;
	
	public static Scanner getScanner() {
		if (s == null) {
			s = new Scanner(System.in);
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		State myState = new StartState();
		while (true) {
			System.out.println(myState.getOptions());
			System.out.print("> ");
			myState = myState.run();
			System.out.println();
		}
	}

}
