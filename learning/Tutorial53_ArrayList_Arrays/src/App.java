import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        // Retrieving
        System.out.println(numbers.get(0));
        System.out.println("The len of the array is "+numbers.size());

        String[] str = { "GEEKS", "FOR", "GEEKS" };
        System.out.println("len String[] is = "+str.length);

        int[] nb = { 1,3,5,6,};
        System.out.println("Len int[] is = "+nb.length);

        // Indexes
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        // Removing items carefully
        numbers.remove(numbers.size()-1);

        // This is very slow
        numbers.remove(0);


        System.out.println("\n Iteration #2");
        for(Integer value: numbers){
            System.out.println(value);
        }



    }
}
