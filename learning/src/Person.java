public class Person {
//    int age;
//    String name;
////    Constructor method
//    public Person(int age, String name){
//        this.age = age;
//        this.name = name;
//    }
//
//    public static void main(String[] args){
//        Person Bob = new Person(31,"Bob");
//        Person Alice = new Person(27, "Alice");
//        System.out.println("Alice age: "+Alice.age);
//    }

//    int age;
//    public static void main(String[] args){
//        Person p = new Person();
//        p.age = 20;
//        System.out.println("Age is " + p.age);
//    }

    int age;
    String name;
    public Person(int a, String b){
        age = a;
        name = b;
    }
    public static void main(String[] args){
        Person p = new Person(20, "Bosh");
        System.out.println("Age is "+ p.age);
        System.out.println("Name is "+ p.name);
    }
}
