public class Parent {
    public String HelloWorld(){
        return "Hello Worl";
    }
    public String GoodbyeWorld(String shaun){
        return "Goodbye world";
    }

}

class Child extends Parent {
    // override: exact same signature, parent method must be virtual
    public String HelloWorld() {
        return "Hello World from Child";
    }

// overload: same name, different order of parameter types
    public String GoodbyeWorld(String name) {
        return "Goodbye World from Child "+name ;
    }
}

class MainClass2 {
    public static void main(String[] args){
        Parent parent1 = new Parent();
        Parent child1 = new Child();
        parent1.HelloWorld();
        child1.HelloWorld();
        String str1;
        String str2;
        str1 = parent1.GoodbyeWorld("Shaun");
        str2 = child1.GoodbyeWorld("Shaun");
        System.out.println(str1);
        System.out.println(str2);
    }
}