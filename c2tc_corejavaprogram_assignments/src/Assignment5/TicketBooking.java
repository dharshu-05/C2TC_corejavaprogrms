package Assignment5;

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private int noOfSeats;

    // Constructor
    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Overloaded payment methods
    public void makePayment(double amount) {
        System.out.println("Amount " + amount + " paid in cash for " 
                           + noOfSeats + " seats to event: " + stageEvent);
    }

    public void makePayment(double amount, String walletNumber) {
        System.out.println("Amount " + amount + " paid using wallet number " 
                           + walletNumber + " for " + noOfSeats + 
                           " seats to event: " + stageEvent);
    }

    public void makePayment(double amount, String creditCardType, String transactionId) {
        System.out.println("Amount " + amount + " paid by " + customer + 
                           " using " + creditCardType + " card (Transaction ID: " 
                           + transactionId + ") for " + noOfSeats + 
                           " seats to event: " + stageEvent);
    }
}
