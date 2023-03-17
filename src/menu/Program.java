package menu;

import java.util.Scanner;

import models.PC;

public class Program {
	private PC a;
	private PC b;
	private PC c;

	public Program() {
		a = new PC(1, "PC of A");
		b = new PC(2, "PC of B");
		c = new PC(3, "PC of C");
	}

	public void mainMenu() {
	    Scanner scanner = new Scanner(System.in);

	    int choice = 0;
	    while (choice != 3) {
	        System.out.println("********  Interface  ********");
	        System.out.println("1. Send method");
	        System.out.println("2. Receive method");
	        System.out.println("3. Quit");
	        System.out.println("*****************************");
	        System.out.print("Choose an option: ");

	        // read input as String
	        String input = scanner.nextLine();

	        try {
	            // parse String to integer
	            choice = Integer.parseInt(input);

	            switch (choice) {
	                case 1:
	                    sendMessageMenu();
	                    break;
	                case 2:
	                    viewMessages();
	                    break;
	                case 3:
	                    System.out.println("Bye bro!");
	                    break;
	                default:
	                    System.out.println("Sike! That's a wrong number!!!");
	                    break;
	            }
	        } catch (NumberFormatException e) {
	            // handle non-integer input
	            System.out.println("Invalid input. Please enter a number.");
	        }
	    }
	}

	private void sendMessageMenu() {
		Scanner scanner = new Scanner(System.in);

		int choice = 0;
		while (choice != 4) {
			System.out.println("********  Choose character  ********");
			System.out.println("1. Choose PC 1");
			System.out.println("2. Choose PC 2");
			System.out.println("3. Choose PC 3");
			System.out.println("4. Back");
			System.out.println("*****************************");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Scanner sub_scanner_1 = new Scanner(System.in);
				int sub_choice_1 = 0;
				while (sub_choice_1 != 3) {
					System.out.println("********  Send a message to:  ********");
					System.out.println("1. PC 2");
					System.out.println("2. PC 3");
					System.out.println("3. Back");
					System.out.println("*****************************");
					System.out.print("Pick a friend: ");
					sub_choice_1 = scanner.nextInt();

					switch (sub_choice_1) {
					case 1:
						System.out.print("Say something: ");
						String message = sub_scanner_1.nextLine();
						this.a.sendMessage(b, message);
						break;
					case 2: 
						System.out.print("Say something: ");
						String message2 = sub_scanner_1.nextLine();
						this.a.sendMessage(c, message2);
					    break;
					case 3:
						break;
					default: 
						System.out.print("Sike! That's a wrong number!!!");
						break;
					}
				}
				break;
			case 2:
				Scanner sub_scanner_2 = new Scanner(System.in);
				int sub_choice_2 = 0;
				while (sub_choice_2 != 3) {
					System.out.println("********  Send a message to:  ********");
					System.out.println("1. PC 1");
					System.out.println("2. PC 3");
					System.out.println("3. Back");
					System.out.println("*****************************");
					System.out.print("Pick a friend: ");
					sub_choice_2 = scanner.nextInt();

					switch (sub_choice_2) {
					case 1:
						System.out.print("Say something: ");
						String message3 = sub_scanner_2.nextLine();
						this.b.sendMessage(a, message3);
						break;
					case 2: 
						System.out.print("Say something: ");
						String message4 = sub_scanner_2.nextLine();
						this.b.sendMessage(c, message4);
					    break;
					case 3: 
					    break;
					default: 
						System.out.print("Sike! That's a wrong number!!!");
						break;
					}
				}
				break;
			case 3:
				Scanner sub_scanner_3 = new Scanner(System.in);
				int sub_choice_3 = 0;
				while (sub_choice_3 != 3) {
					System.out.println("********  Send a message to:  ********");
					System.out.println("1. PC 1");
					System.out.println("2. PC 2");
					System.out.println("3. Back");
					System.out.println("*****************************");
					System.out.print("Pick a friend: ");
					sub_choice_3 = scanner.nextInt();

					switch (sub_choice_3) {
					case 1:
						System.out.print("Say something: ");
						String message = sub_scanner_3.nextLine();
						this.c.sendMessage(a, message);
						break;
					case 2: 
						System.out.print("Say something: ");
						String message2 = sub_scanner_3.nextLine();
						this.c.sendMessage(b, message2);
					    break;
					case 3: 
						break;
					default: 
						System.out.print("Sike! That's a wrong number!!!");
						break;
					}
				}
				break;
			case 4:
				System.out.println("Bye bro!");
				System.out.flush();  
				break;
			default:
				System.out.println("Sike! That's a wrong number!!!");
				break;
			}
		}
	}
	
	private void viewMessages() {
		Scanner scanner = new Scanner(System.in);

		int choice = 0;
		while (choice != 4) {
			System.out.println("********  View message  ********");
			System.out.println("1. PC 1");
			System.out.println("2. PC 2");
			System.out.println("3. PC 3");
			System.out.println("4. Quit");
			System.out.println("*****************************");
			System.out.print("Choose an option: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				this.a.displayReceiveQueue();
				this.a.receiveMessage();
				break;
			case 2:
				this.b.displayReceiveQueue();
				this.b.receiveMessage();
				break;
			case 3:
				this.c.displayReceiveQueue();
				this.c.receiveMessage();
				break;
			case 4:
				break;
			default:
				System.out.println("Sike! That's a wrong number!!!");
				break;
			}
		}
	}

}