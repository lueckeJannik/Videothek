package shared.domainModel;

public class Film {
    private String details;
    private int id;
    private int lentTO;
    private String name;

    public Film(String details, int id, int lentTo, String name){
        this.details = details;
        this.id = id;
        this.lentTO = lentTo;
        this.name = name;
    }
}
