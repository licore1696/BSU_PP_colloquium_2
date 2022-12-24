import java.util.List;

public class EmailManager {
    private IEmailStrategy strategy;

    public EmailManager(IEmailStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IEmailStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Email> executeStrategy(List<Email> emails) {
        return strategy.execute(emails);
    }
}
