import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String button;
		
		button = "";
		
		do {
			System.out.println("To begin, turn on the remote control:");
			button = kb.next();
			
		} while (!button.equals("ON"));
		turnOn();
		
	
	}

	public static void pressButton() {
		System.out.println("BOOP!");
	}
	public static void turnOn() {
		System.out.println("TURNING ON...");
	}
}
