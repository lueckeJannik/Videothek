package reminders.infrastructure;

import reminders.sharedDTO.ReminderRequest;

public interface ReminderClientInterface {
    public boolean sendReminder(ReminderRequest request);
}
