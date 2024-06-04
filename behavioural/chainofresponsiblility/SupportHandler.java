package behavioural.chainofresponsiblility;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleTicket(SupportTicket ticket) throws Exception;
}
