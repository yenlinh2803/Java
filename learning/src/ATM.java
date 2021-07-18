public class ATM {
    // Static variables
    public static int totalMoney = 20;
    public static int numATMs = 3;
    public int money =1;
    public int demoVariable = 5;

//    The static Keyword
    public static void averageMoney(){
        System.out.println(totalMoney/ numATMs);
    }

    public static void statiMethod(){
        totalMoney +=1;
        System.out.println("totalMoney: "+ totalMoney);
    }

    public void nonStaticMethod(){
        totalMoney +=1;
        System.out.println("totalMoney: "+ totalMoney);
    }

    public void demoStaticMethod(){
        System.out.println("demoVariable: "+demoVariable);
    }

    public static void main(String[] args){
        //Accessing a static variable
        System.out.println("totalMoney: "+ATM.totalMoney);
        System.out.println("total number of ATMs: "+ATM.numATMs);
        // Calling a static method
        ATM.averageMoney();
        ATM.statiMethod();
        ATM atm = new ATM();
        atm.nonStaticMethod();
        atm.demoStaticMethod();

    }
}
