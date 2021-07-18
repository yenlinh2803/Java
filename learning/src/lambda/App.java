package lambda;
//https://www.caveofprogramming.com/java/whats-new-in-java-8-lambda-expressions.html

//interface Executable {
//    void execute();
//}

interface Executable {
    int execute();
}

//class Runner {
//    public void run(Executable e) {
//        System.out.println("Executing code block ...");
//        System.out.println("Executing code block test...");
//        e.execute();
//    }
//}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute();
        System.out.println("Return value is "+value);
    }
}


//##############################################
//() -> System.out.println("Hello there");

/*
() -> { System.out.println("This is code passed in a lambda");
System.out.println("Hello there");
        };
 */

/*
() -> { System.out.println("This is code passed in a lambda");
System.out.println("Hello there");
return 10;
        };
 */

/*
runner.run(() -> 8 );
 */

public class App {
    public static void main(String[] args){
        Runner runner = new Runner();
//        runner.run(new Executable() {
//            public void execute() {
//                System.out.println("Hello there");
//            }
//        });

        runner.run(new Executable() {
            public int execute() {
                System.out.println("Hello there");
                return 7 ;
            }
        });
        System.out.println("================");
//        runner.run(() -> System.out.println("Hello there"));

        System.out.println("================");
        runner.run(() -> {
            System.out.println("This is code passed in a lambda");
            System.out.println("Hello there");
            return 10;
        });
        System.out.println("================");
        runner.run(() -> 8 );
    }
}
