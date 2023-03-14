package shared.domainModel;

public class User {
    String name = "ExampleName";
    boolean needsReminder = false;
    String mail = "Example.Mail@gmail.com";
    public boolean getNeedsReminder(){
        return needsReminder;
    }

    public String getMail(){
        return this.mail;
    }

    public String getName(){
        return this.name;
    }
}
