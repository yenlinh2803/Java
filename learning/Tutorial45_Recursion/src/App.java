public class App {
    public static void main(String[] args){
//        System.out.println("Hello");
        //int value = 4;
//        calculate(4);
        System.out.println(calculate2(5));
//        calculate2(3);
    }

    private static void calculate(int value){
//        value = value -1 ;
        System.out.println((value));
        if(value ==1){
            return ;
        }
        calculate(value-1);

    }

    private static int calculate2(int value){
//        value = value -1 ;

        if(value ==1){
            return 1 ;
        }

        System.out.println(("value: "+value));
        System.out.println("---");
//        System.out.println(calculate2(value-1));
        return calculate2(value-1)*value;

    }
}
