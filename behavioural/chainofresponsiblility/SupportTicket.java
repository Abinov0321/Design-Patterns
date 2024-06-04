package behavioural.chainofresponsiblility;

public class SupportTicket {
    private String issueType;

    public SupportTicket(String issueType) {
        this.issueType = issueType;
    }

    public String getIssueType() {
        return issueType;
    }
}
