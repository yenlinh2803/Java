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

//Static Methods
//    public static

}


