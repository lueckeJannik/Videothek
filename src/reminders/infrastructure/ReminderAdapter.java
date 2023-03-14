package reminders.infrastructure;

import reminders.core.ports.ReminderPort;
import shared.infrastructure.mailserver.MailClientInterface;
import shared.infrastructure.mailserver.MailRequest;

public class ReminderAdapter implements ReminderPort {
    private MailClientInterface client;
    public ReminderAdapter(MailClientInterface clientinterface){ 
        client = clientinterface;
    }

    @Override
    public boolean sendReminder(String mail, String message) {
        String clientMailPrefix = mail.substring(5);//Example values to split the mail / mapping
        String clientMailSuffix = mail.substring(5, 8);
        MailRequest request = new MailRequest(clientMailPrefix, clientMailSuffix, message);
        if(client.sendReminder(request)){ 
            return true;
        }
        else{
            return false;
        }

    }
}
