public class PersonTemp implements Info {

    private String name;

    public PersonTemp(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello there.");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
}
