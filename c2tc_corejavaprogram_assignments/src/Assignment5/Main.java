package Assignment5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter booking details (Event,Customer,Seats):");
        String input = sc.nextLine();
        String[] data = input.split(",");

        TicketBooking booking = new TicketBooking(data[0], data[1], Integer.parseInt(data[2]));

        System.out.println("Select Payment Mode:\n1. Cash\n2. Wallet\n3. Credit Card");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                booking.makePayment(3000.0); // Example
                break;
            case 2:
                System.out.println("Enter Wallet Number:");
                String wallet = sc.next();
                booking.makePayment(3000.0, wallet);
                break;
            case 3:
                System.out.println("Enter Credit Card Type:");
                String cardType = sc.next();
                System.out.println("Enter Transaction ID:");
                String txn = sc.next();
                booking.makePayment(3000.0, cardType, txn);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
