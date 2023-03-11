package reminders.sharedDTO;

public class ReminderRequest {
    private String mailPrefix;
    private String mailSuffix;

    public ReminderRequest(String pre, String suf){
        mailPrefix = pre;
        mailSuffix = suf;
    }

    public String getPre(){
        return mailPrefix;
    }

    public String getSuf(){
        return mailSuffix;
    }
}
