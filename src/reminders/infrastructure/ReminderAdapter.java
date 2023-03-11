package reminders.infrastructure;

import reminders.sharedDTO.ReminderRequest;

public class ReminderAdapter implements ReminderPort {
    private ReminderClientInterface client;
    public ReminderAdapter(ReminderClientInterface clientinterface){ //dependency Inversion (interface as parameter)
        client = clientinterface;
    }

    @Override
    public boolean sendReminder(String mail) {
        String clientMailPrefix = mail.substring(5);//Example values to split the mail / mapping
        String clientMailSuffix = mail.substring(5, 8);
        ReminderRequest request = new ReminderRequest(clientMailPrefix, clientMailSuffix);
        if(client.sendReminder(request)){ 
            return true;
        }
        else{
            return false;
        }

    }
}
