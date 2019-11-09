import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String button;
		String channel;

		button = "";

		do {
			System.out.println("To begin, turn on the remote control:");
			button = kb.next();

		} while (!button.equals("ON"));
		turnOn();

		while (true) {
			System.out.println("Please press a button 0-9:");
			channel = kb.next();
			switch (channel) {
				case "0":
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					pressButton();
					break;
				default:
					wrongButton();
					break;
			}
			if (channel.equals("OFF")) {
				turnOff();
				break;
			}
		}
		kb.close();

	}

	public static void pressButton() {
		System.out.println("BOOP!");
	}

	public static void turnOn() {
		System.out.println("TURNING ON...");
	}

	public static void turnOff() {
		System.out.println("TURNING OFF...");

	}
	public static void wrongButton() {
		System.out.println("COMMAND NOT RECOGNIZED");
	}
}
