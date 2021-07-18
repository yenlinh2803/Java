public class App {
    public static void main(String[] args){
        App app = new App();
        int a = 7;
        System.out.println("1. Value is "+  a );
        app.show(a);
        System.out.println("4. Value is "+ a );
        // #################################
        System.out.println();
        Person person = new Person("Bob");
        System.out.println("1. Persom is " +person);
        app.show(person);
        System.out.println("4. Persom is " +person);

    }

    public void show(int value){
        System.out.println("2. Value is "+value);
        value = 8;
        System.out.println("3. Value is "+value);
    }

    public void show(Person person){
        System.out.println("2. Persom is " +person);
        person.setName("Sue");
        person = new Person("Mike");
        System.out.println("3. Persom is " +person);

    }

}
