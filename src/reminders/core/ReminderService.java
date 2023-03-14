package reminders.core;

import reminders.core.ports.ReminderPort;
import shared.domainModel.User;
import java.util.ArrayList;
import java.util.List;

public class ReminderService {

    private ReminderPort port;
    public ReminderService(ReminderPort port){
        this.port = port;
    }

    public void setPort(ReminderPort port){
        this.port = port;
    }

    public void checkReminders() {
        List<User> u = getAllusers();
        for (User user : u) {
            boolean x = checkUserReminder(user);
            if(x){
                port.sendReminder(user.getMail(), generateReminder(user.getName()));
            }
        }
    }

    private List<User> getAllusers() {
        List<User> users = new ArrayList<>();
        return users;
    }

    private boolean checkUserReminder(User user){
        if(user.getNeedsReminder()){
            return true;
        }
        else{
            return false;
        }
    }

    private String generateReminder(String name){
        return name + "Bitte melde dich!";
    }
}
