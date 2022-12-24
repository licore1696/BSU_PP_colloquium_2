import java.util.List;

public interface IEmailStrategy {
    List<Email> execute(List<Email> emails);
}
