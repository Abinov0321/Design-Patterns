package behavioural.chainofresponsiblility;

public class CustomerServiceHandler extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket ticket) throws Exception {
        if (ticket.getIssueType().equals("CustomerService")) {
            System.out.println("Customer Service handled the ticket.");
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        } else {
            throw new Exception("No handler available for the ticket.");
        }
    }
}