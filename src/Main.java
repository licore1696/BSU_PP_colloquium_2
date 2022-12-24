import java.util.*;
class Main {
    public static void main(String[] args) {
        EmailManager manager = new EmailManager(new SortByDateStrategy());
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("Alice", "Bob", "Hello", "Hi Bob, how are you?", new Date(2020, 1, 1)));
        emails.add(new Email("Bob", "Alice", "Re: Hello", "Hi Alice, I'm fine, thanks. How about you?", new Date(2020, 1, 2)));
        emails.add(new Email("Charlie", "Alice", "Important", "Hello, please read this important email", new Date(2020, 1, 3)));

        // Вызываем тестовый метод
        testSortByDate(manager, emails);
        testFilterBySubject(emails);
    }

    public static void testSortByDate(EmailManager manager, List<Email> emails) {
        List<Email> sortedEmails = manager.executeStrategy(emails);
        System.out.println(sortedEmails.get(0).getDate()); // Должно вывести 2020-01-01
        System.out.println(sortedEmails.get(1).getDate()); // Должно вывести 2020-01-02
        System.out.println(sortedEmails.get(2).getDate()); // Должно вывести 2020-01-03
    }
    public static void testFilterBySubject( List<Email> emails) {
        EmailManager manager = new EmailManager(new FilterBySubjectStrategy("Hello"));
        List<Email> filteredEmails = manager.executeStrategy(emails);
        System.out.println("Testing filter by subject strategy: ");
        for (Email email : filteredEmails) {
            System.out.println(email.getSubject());
        }
    }
}