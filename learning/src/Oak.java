public class Oak extends Plant {
    public Oak() {
        // Wont work type
//        type = "tree";

        // This.works -- sze is protected, Oak is a subclass
        this.size = "large";

        // No access
        this.height = 10;

    }
}
