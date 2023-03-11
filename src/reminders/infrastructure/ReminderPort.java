package reminders.infrastructure;

public interface ReminderPort {
    public boolean sendReminder(String mail);
}
