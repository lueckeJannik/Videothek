package reminders.core;

import DomainModel.*;

import java.util.ArrayList;
import java.util.List;

public class ReminderService {

    public void checkReminders() {
        List<User> u = getAllusers();
        for (User user : u) {
            boolean x = checkUserReminder(user);
            if(x){
                
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
}
