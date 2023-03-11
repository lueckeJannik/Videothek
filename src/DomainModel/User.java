package DomainModel;

public class User {
    boolean needsReminder = false;
    String mail = "Example.Mail@gmail.com";
    public boolean getNeedsReminder(){
        return needsReminder;
    }
}
