package shared.infrastructure.mailserver;

public interface MailClientInterface {
    public boolean sendReminder(MailRequest request);
}
