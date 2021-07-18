public class Plant {
    // Bad practice
    public String name;

    // Acceptable practice
    public final static int id = 8;


//    public String type;
    private String type;
    protected String size;
    int height;

    //public String type;
    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 9;

    }

}
