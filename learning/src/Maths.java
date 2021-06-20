public class Maths {
//     //way 1
//    public static int sum(int a, int b){
//        int result = a+b;
//        System.out.println("Sum is "+result);
//        return result;
//    }
//
//    public static void main(String[] args){
//        int result;
//        result = sum(10,20);
//        System.out.println("result sum = "+ result);
//    }

//    //Way 2
//    public static void sum(int a, int b){
//        int result = a + b ;
//        System.out.println("Sum is "+ result);
//    }
//
//    public static void main(String [] args){
//        sum(0,20);
//    }

//    //Way 3
//    public int sum(int a, int b){
//        int k = a + b;
//        return k;
//    }
//
//    public static void main(String[] args){
//        Maths m = new Maths();
//        int result = m.sum(10,20 );
//        System.out.println("sum is " + result);
//    }

//    public static void main(String[] args){
//        int i,j;
//        System.out.println("These 2 variables are available in main method only");
//    }


//    Difference between public static and only public method
    public int sum(int a, int b){
        return(a+b);
    }

    public static int sum_2(int a, int b){
        return(a+b);
    }

    public static void main(String[] args){
        Maths m = new Maths();
//        int result = Maths.sum(15,20);
        int result = m.sum(15,20);
        System.out.println("Sum is "+result);

        int result_2 = Maths.sum_2(1,3);
//        int result_2 = m.sum_2(1,3);
        System.out.println("Sum_2 is "+result_2);

    }

}
