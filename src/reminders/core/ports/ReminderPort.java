package reminders.core.ports;

public interface ReminderPort {
    public boolean sendReminder(String mail, String message);
}
