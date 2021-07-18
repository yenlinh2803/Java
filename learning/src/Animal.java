//// Parent class
//public class Animal {
//    String sound;
//    Animal(String snd){
//        this.sound = snd;
//    }
//}
//
//// Child class
//class Dog extends Animal{
//    // super() method can act like the parent constructor inside the child class constructor.
//    Dog(){
//        super("Woof");
//    }
//
//    // alternatively, we can override the constructor completely by defining a new constructor.
//    Dog(){
//        this.sound = "woof";
//    }
//}


////Polymorphism in Java
//// Parent class
//class Animal{
//    public void greeting(){
//        System.out.println("The animal greets you");
//    }
//}
//// Child class
//class CatNew extends Animal {
//    public void greeting(){
//        System.out.println("The cat meo meo");
//    }
//}
//
//class MainClass{
//    public static void main(String[] args){
//        Animal animal1 = new Animal(); // Animal object
//        Animal cat1 = new CatNew(); // Cat object
//        animal1.greeting();
//        cat1.greeting();
//    }
//}


////Method Overriding in Java
//// Parent class
//class Animal {
//    public void eating(String cat1_str) {
//        System.out.println("The animal is eating ");
//    }
//}
//// Child class
//class Dog extends Animal{
//    // Dog's eating method overrides Animal's eating method
////    @Override
//    public void eating(String cat1_str){
//        System.out.println(" The dog is eating");
//    }
//}
//class CatNew extends Animal {
//    public void eating(String aStr) {
//        System.out.println("The cat is eating "+aStr);
//    }
//}
//class MainClass{
//    public static void main(String[] args){
//        String cat1_str = "abc";
//        Animal an = new Animal();
//        Animal dog1 = new Dog();
//        Animal cat1 = new CatNew(); // Cat object
//        an.eating(cat1_str);
//        dog1.eating(cat1_str);
//        cat1.eating(cat1_str);
//    }


//Child Classes in Arrays and ArrayLists
// Parent class
class Animal {
    String sound;
    public void sound(String snd){
        System.out.println("Animal sound "+snd);
    }
}
class CatNew extends Animal {
    public void sound(String snd) {
        System.out.println("The cat is eating " + snd);
    }
}
class Dog extends Animal {
    public void sound(String snd) {
        System.out.println("The dog is eating " + snd);
    }
}
class Pig extends Animal {
    public void sound(String snd) {
        System.out.println("The pig is eating " + snd);
    }
}

class MainClass3 {
    public static void main(String[] args){
        String str = "abv";
        // Animal parent class with child classes Cat, Dog, and Pig.
        Animal cat1, dog1, pig1;
        cat1 = new CatNew();
        dog1 = new Dog();
        pig1 = new Pig();
        // Set up an array with instances of each animal
        Animal[] animals = {cat1, dog1, pig1};

        for (Animal animal: animals){
            System.out.println(animal.getClass().getName());
            animal.sound(str);
        }

    }
}