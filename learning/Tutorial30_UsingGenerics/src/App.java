import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(0);
        System.out.println(fruit);

        /////////////Mofern style///////
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        System.out.println(numbers.get(1));

        ///////////// There can be more than one type argument ///////
//        HashMap<Integer, String> map = new HashMap<Integer, String>();
//        ArrayList<Animal> someList = new ArrayList<>;
    }
}
