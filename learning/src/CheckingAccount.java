public class CheckingAccount<main, psvm> {
    private String name;
    private int balance;
    private String id;

//    Accessor Methods
    public int getBalance(){
        return this.balance;
    }

//    Mutator Methods
    public void setBalance(int newBalance){
        this.balance = newBalance ;
    }

//    The this Keyword with Variables
    public void speak(String name){
        // Prints the instance variable named name
        System.out.println(this.name);

        // Prints the local variable named name
        System.out.println(name);
    }

//The this Keyword with Methods
//In Java, the this keyword can be used to call methods when writing classes.
    public void exampleMethodOne(){
        System.out.println("Hello");
    }
    public void exampleMethodTwo(){
        this.exampleMethodOne();
        System.out.println("There");
    }

//    public static void main(String[] args){
//        this.exampleMethodTwo();
//    }

////Static Methods
//    public static int getTotal(int a, int b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//        int x = 3;
//        int y = 2;
//        System.out.println(getTotal(x,y));
//    }

////    Math Class
//    public static void main(String[] args){
//        int largeNumber = Math.max(3,10);
//        System.out.println(largeNumber);
//
//        System.out.println(Math.abs(-7.0));
//        System.out.println(Math.pow(5,3));
//        System.out.println(Math.sqrt(52));
//    }



}


