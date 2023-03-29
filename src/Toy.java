public class Toy {
    protected String name;
    protected String ID;
    protected String comment;
    protected Integer numOfToys;
    protected Integer value;

    public String getID() { return ID; }
    public String getName() {
        return name;
    }
    public String getComment() {
        return comment;
    }
    public Integer getNumOfToys() {
        return numOfToys;
    }
    public Integer getValue() {
        return value;
    }
    public void setID(String a) { this.ID = a; }
    public void setName(String a) {
        this.name = a;
    }
    public void setComment(String a) {
        this.comment = a;
    }
    public void setNumOfToys(Integer a) {
        this.numOfToys = a;
    }
    public void setValue(Integer a) {
        this.value = a;
    }

    public Toy(String ID, String name, String comment, Integer numOfToys, Integer value)
    {
        this.ID = ID;
        this.name = name;
        this.comment = comment;
        this.numOfToys = numOfToys;
        this.value = value;
    }
    public Toy(){
        this("0","None", "None", 0, 0);
    }
}
