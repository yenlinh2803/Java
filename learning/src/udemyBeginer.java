import ocean.Fish;
import ocean.plants.Seaweed;

// car Dealership
//https://github.com/Rizzim/carDealership
//https://github.com/MunGell/awesome-for-beginners#java


public class udemyBeginer {
    public static void main(String[] args) {
//        for(int i=0; i<10; i++){
//            System.out.println("Hello "+i);
//        }

//        int loop = 0;
//        while (loop<7){
//            System.out.println("Looping "+loop);
//            if (loop==5){
//                break;
//            }
//            System.out.println("Running");
//            loop+=1;
//        }

//        Getting user input
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a line text: ");
//        double value  = input.nextDouble();
//        System.out.println("You enter: "+value );

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number");
//        int value = scanner.nextInt();
//        while(value!=5) {
//            System.out.println("enter a number");
//            value = scanner.nextInt();
//        }

//        int value = 0;
//        do {
//            System.out.println("Enter a number");
//            value = scanner.nextInt();
//        }
//        while(value!=5);
//        System.out.println("Got 5");

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a command: ");
//        String text = input.nextLine();
//        switch (text){
//            case "start":
//                System.out.println("Machine started");
//                break;
//            case "stop":
//                System.out.println("Machine stop");
//                break;
//            default:
//                System.out.println("Command not recognize");
//        }

//        //Arrays
//        int value = 7;
//        int[] values;
//        values = new int[3];
//        for(int i=0 ; i< values.length; i++){
//            System.out.println(values[i]);
//        }
//        System.out.println("End loop");
//        System.out.println(values[0]);
//        values[0] = 10;
//        System.out.println(values[0]);
//        int[] numbers = {5,6,7};
//        for (int i=0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

////        Arrays of Strings
//        String[] words = new String[3];
//        words[0]= "Hello";
//        words[1]= "to";
//        words[2]= "you";
//
//        System.out.println(words[2]);
//        String[] fruits = {"apple","banna","pear","kiwi"};
//
//        for(String fruit: fruits){
//            System.out.println(fruit);
//        }
//        int value = 0 ;
//        String text = null;
//        System.out.println(text);
//        System.out.println("----");
//        String[] texts = new String[2];
//        for(String a: texts){
//            System.out.println(a);
//        }
//        System.out.println("----");
//        texts[0]="one";
//        for(String a: texts){
//            System.out.println(a);
//        }

////        Multi-dimension array
//        int[] values = {3,5, 2343};
//        System.out.println(values[2]);
//        int[][] grid = {
//                {3,5,4545},
//                {2,4},
//                {1,2,3,4,6}
//        };
//        System.out.println(grid[2][2]);
//        System.out.println(grid[1][1]);
//        System.out.println(grid[0][2]);
//
//        String[][] texts = new String[2][3];
//        texts[0][1] = "hello world";
//        System.out.println(texts[0][1]);
//        System.out.println("---");
//        for(int i=0; i<grid.length; i++){
//            for(int k=0; k<grid[i].length;k++){
//                System.out.println(grid[i][k]);
//            }
//        }
//
//        String [][] words = new String[2][];
//        System.out.println(words[0]);
//        words[0] = new String[3];
//        words[0][1] = "hi there";
//        System.out.println(words[0][1]);

////        Class and Object + Getters and Return Value
//        PersonTemp person1 = new PersonTemp();
//        person1.name = "Joe Bloggs";
//        person1.age = 37;
//        person1.speak();
//        PersonTemp person2 = new PersonTemp();
//        person2.name = "Sarah Smith";
//        person2.age = 20;
//        person2.sayHello();
//        System.out.println(person1.name);
////        person2.calculateYearsToRetirement();
//        int yearLeft = person2.calculateYearsToRetirement();
//        System.out.println(yearLeft);


//        //Methods Parameter
//        Robot sam = new Robot();
//        sam.speak("Hi I'm Sam");
//        sam.jump(7);
//        sam.move("West", 12.2);
//        String greeting = "Hello there";
//        sam.speak(greeting);
//        int value = 10 ;
//        sam.jump(value);

//        //Setters and "this"
//        Frog frog1 = new Frog();
//        frog1.name = "Bertie";
//        frog1.age = 1;
////        frog1.setName("Bertie");
//        System.out.println(frog1.getName());
//        System.out.println(frog1.getAge());
//        frog1.setName("Kitty");
//        System.out.println(frog1.getName());
//        frog1.setAge(20);
//        System.out.println(frog1.getAge());
//        frog1.setAge(20);
//        frog1.setName("Mai");
//        frog1.setInfo("Hoa",12);
//        System.out.println(frog1.getName() + " is " +frog1.getAge());


//        //Constructor
//        Machine machine1 = new Machine();
//        Machine machine2 = new Machine("Bertie");
//        Machine machine3 = new Machine("Kitty",7);


//        //Static and Final
//        Thing.description = "I am a Thing";
//        System.out.println(Thing.description);
//        Thing.showInfo();
//        System.out.println("Before creating oject count is "+Thing.count);
//        Thing thing1 = new Thing();
//        Thing thing2 = new Thing();
//        System.out.println("Before creating oject count is "+ Thing.count);
//        thing1.name = "Bob";
//        thing2.name = "Sue";
//        System.out.println(thing1.name);
//        System.out.println(thing2.name);
//        thing1.showName();
//        thing2.showName();
//        System.out.println(Math.PI);
//        System.out.println(Thing.luckyNunber);

//        // String Builder and String Formatting
//        // Inefficient
//        String info = "";
//        info += "My name is Bob.";
//        info +=" ";
//        info += "I am a builder";
//        System.out.println(info);
//        // More efficient
//        StringBuilder sb = new StringBuilder("");
//        sb.append("My name is Sue");
//        sb.append(" ");
//        sb.append("I am a lion tamer");
//        System.out.println(sb.toString());
//
//        StringBuilder s = new StringBuilder();
//        s.append("My name is Rose.")
//        .append(" ")
//        .append("I am a skydiver");
//        System.out.println(s.toString());
//        // Formatting
//        System.out.print("Here is some text.\\That was a tab.\nThat was a newline");
//        System.out.println("More text");
//        // Formatting integer
//        System.out.printf("More text %d, quantity is %d",5,12);
//        for(int i=0; i<20; i++){
//            System.out.printf("%-2d: some text here\n",i);
//            System.out.printf("%2d: some text here\n",i);
//            System.out.println("------");
//        }
//        // Formatting float
//        System.out.printf("total value: %.2f\n",5.789);


//        // The toString method
//        FrogTemp frog1 = new FrogTemp( 7, "Freddy");
//        FrogTemp frog2 = new FrogTemp( 5, "Roger");
//        System.out.println(frog1.toString());
//        System.out.println(frog2.toString());


//        // Inheritance
//        Machine mach1 = new Machine();
//        mach1.start();
//        mach1.showInfo();
//        mach1.stop();
//        Car car1 = new Car();
//        car1.start();
//        car1.wipeWindShield();
//        car1.stop();


//        // Packages
//        Fish fish = new Fish();
//        Seaweed weed = new Seaweed();


//        // Interfaces
//        Machine mach1 = new Machine();
//        mach1.start();
//
//        PersonTemp  person1 = new PersonTemp("Bon");
//        person1.greet();
//
//        Info info1 = new Machine();
//        info1.showInfo();
//        System.out.println();
//
//        Info info2 = person1;
////        info2.showInfo();
//        outputInfo(mach1);
//        outputInfo(person1);

        // Public, private, protected
        /*
        private: only within same class
        public: from anywhere
        protected : subclass and same package
        no modifier: same package only
         */
        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(plant.id);
        System.out.println(plant.size);
        System.out.println(plant.height);

        Grass grass = new Grass();
//        System.out.println("Grass height: "+grass.height);




    }
    // Interfaces
    private static void outputInfo(Info info){
        info.showInfo();
    }
}

/*
//// The toString method
//class FrogTemp{
//    private int id;
//    private String name;
//
//    public FrogTemp(int id, String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(id).append(": ").append(name);
////        return this.id+ ":"+this.name;
//        return sb.toString();
//    }
//}

class Thing{
    public String name;
    public static String description;
    public void showName() {
        System.out.println("Object id is "+id+" & Name is "+name);
    }
    public static void showInfo() {
        System.out.println("Hello ");
    }
    public final static int luckyNunber = 7;
    public  static int count = 0 ;
    public int id;
    public Thing() {
        id = count;
        count++;
    }
}

//Constructor
class Machine{
    private String name;
    private int code ;
    public Machine(){
        this("Annie",0);
        System.out.println("Constructor Machine running");
        System.out.println("Name "+this.name+" Code "+this.code);
    }
    public Machine(String name){
        this(name,7);
        System.out.println("Second Machine running");
//        this.name = name;
        System.out.println("Name "+this.name+" Code "+this.code);
    }
    public Machine(String name, int code){
        System.out.println("Third Machine running");
        this.name = name;
        this.code = code;
        System.out.println("Name "+this.name+" Code "+this.code);
    }

}

//Setters and "this"
class Frog{
    String name;
    int age;
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge ;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
//    public void setInfo(){
//        setName(name);
//        setAge(age);
//        System.out.println(name + " is " +age);
//    }
    public void setInfo(String name, int age){
        setName(name);
        setAge(age);

    }
}

//Methods Parameter
class Robot{
    public void speak(String text){
        System.out.println(text);
    }
    public void jump (int height) {
        System.out.println("Jumping "+height);
    }
    public void move(String direction, double distance){
        System.out.println("Mobing "+distance+" meters in direction "+direction);
    }
}



//Getters and Return Value
class PersonTemp {
    // Instance variables (data or state)
    String name;
    int age;
    // Calsses can contain
    // 1. Data
    // 2. Subroutines (methods)
//    void speak(String nametemp) {
//        name = nametemp;
//        System.out.println("Hello method "+name);
//    }
    void speak() {
        System.out.println("Hello method "+name);
        for (int i=0; i<3; i++){
            System.out.println("My name is "+name+" and I am "+age);
        }
    }
    void sayHello(){
        System.out.println("Hello there ");
    }
    int calculateYearsToRetirement(){
        int yearLeft = 65 -age;
        System.out.println("Year Left "+ yearLeft);
        return yearLeft;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}
*/
