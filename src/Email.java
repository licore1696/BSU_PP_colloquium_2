import java.util.Date;

public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;
    private Date date;

    public Email(String from, String to, String subject, String body, Date date) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public Date getDate() {
        return date;
    }
}
