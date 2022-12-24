import java.util.ArrayList;
import java.util.List;

public class FilterBySubjectStrategy implements IEmailStrategy {
    private String subject;

    public FilterBySubjectStrategy(String subject) {
        this.subject = subject;
    }

    public List<Email> execute(List<Email> emails) {
        List<Email> filteredEmails = new ArrayList<>();
        for (Email email : emails) {
            if (email.getSubject().contains(subject)) {
                filteredEmails.add(email);
            }
        }
        return filteredEmails;
    }
}
