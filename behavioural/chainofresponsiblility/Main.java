package behavioural.chainofresponsiblility;

public class Main {
    public static void main(String[] args) {
        try {
            SupportHandler techSupport = new TechnicalSupportHandler();
            SupportHandler customerService = new CustomerServiceHandler();

            techSupport.setNextHandler(customerService);

            SupportTicket ticket1 = new SupportTicket("Technical");
            techSupport.handleTicket(ticket1);

            SupportTicket ticket2 = new SupportTicket("CustomerService");
            techSupport.handleTicket(ticket2);

            // This will throw an error
            SupportTicket ticket3 = new SupportTicket("Sales");
            techSupport.handleTicket(ticket3);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
