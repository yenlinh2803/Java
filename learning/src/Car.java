public class Car extends Machine{
    @Override
    public void start() {
        System.out.println("Car start ");
    }
    @Override
    public void stop() {
        System.out.println("Car stop ");
    }
    public void wipeWindShield(){
        System.out.println(" Wipping windshield");
    }

//    public void showInfo(){
//        System.out.println("Car name "+name);
//    }
}
