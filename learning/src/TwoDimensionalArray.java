public class TwoDimensionalArray {
    public static void main(String[] args){
////        Nested Iteration Statements
//        for(int outer =0; outer<3; outer++){
//            System.out.println("The outer index is: "+ outer);
//            for(int inner = 0;inner<4; inner++){
//                System.out.println("The inner index is: "+ inner);
//            }
//        }

////        Declaring 2D Arrays
//        int [][] twoIntArray;
//        String[][] twoStringArray;
//        double[][] twoDoubleArray;

////        Accessing 2D Array Elements
//        //Given a 2d array called `arr` which stores `int` values
//        int[][] arr = {{1,2,3},{4,5,6}};
//        //We can get the value `4` by using
//        int retrieved = arr[1][0];
//        System.out.println("retrieved: "+ retrieved);

////        Initializer Lists
//        // Method one: declaring and intitializing at the same time
//        double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
//        // Method two: declaring and initializing separately:
//        String[][] stringValues;
//        stringValues = new String[][] {{"work","with"},{"2D","array"},{"is","fun"}};
//        String printValue = stringValues[1][1];
//        System.out.println(printValue);
//        doubleValues[0][0]= 100.5;
//        System.out.println(doubleValues[0][0]);

//        Row-Major Order
        double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
        for(int i=0; i<doubleValues.length; i++){
            for(int j=0;j<doubleValues[i].length;j++){
                System.out.println(doubleValues[i][j]);
            }
        }
        System.out.println("Starrt another");
//        Column-Major Order
        for(int i = 0; i < doubleValues[0].length; i++) {
            for(int j = 0; j < doubleValues.length; j++) {
                System.out.println(doubleValues[j][i]);
            }
        }
        System.out.println("Start again once more");
//        Traversing With Enhanced For Loops
        String[][] stringValues;
        stringValues = new String[][] {{"work","with"},{"2D","array"},{"is","fun"}};
        for(String[] rowOfStrings: stringValues){
            for(String s: rowOfStrings){
                System.out.println(s);
            }
        }

    }
}
