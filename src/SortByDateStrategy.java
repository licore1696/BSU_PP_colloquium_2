import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByDateStrategy implements IEmailStrategy {
    public List<Email> execute(List<Email> emails) {
        Collections.sort(emails, new Comparator<Email>() {
            @Override
            public int compare(Email o1, Email o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        return emails;
    }
}
