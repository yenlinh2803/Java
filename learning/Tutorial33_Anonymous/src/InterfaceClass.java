// Interface
interface Animal{
    public void animalSound();
    public void sleep();// interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal{
    @Override
    public void animalSound(){
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep(){
        // The body of sleep() is provided here
        System.out.println("Zzzzz");
    }
}

public class InterfaceClass {
    public static void main(String[] args){
        Pig mypig = new Pig();
        mypig.animalSound();
        mypig.sleep();
    }
}
