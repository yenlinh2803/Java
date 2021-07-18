public class Machine implements Info{
    private String name = "I am machine";
    private int id = 7;
    public void start() {
        System.out.println("Machine started");
    }
    public void stop() {
        System.out.println("Machine stop");
    }
    public void showInfo(){
        System.out.println("Machine name "+ name);
        System.out.println("Machine ID "+ id);
    }

}
