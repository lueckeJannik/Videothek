package shared.infrastructure.mailserver;

public class MailRequest {
    private String mailPrefix;
    private String mailSuffix;
    private String text;

    public MailRequest(String pre, String suf, String text){
        mailPrefix = pre;
        mailSuffix = suf;
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public String getPre(){
        return mailPrefix;
    }

    public String getSuf(){
        return mailSuffix;
    }
}
