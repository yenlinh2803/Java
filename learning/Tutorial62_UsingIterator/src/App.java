import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashMap;

public class App {
    public static void main(String[] args){
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("Fox");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Raabbit");

        Iterator<String> it = animals.iterator();
        System.out.println(it);
        while(it.hasNext()){
            String value = it.next();
            System.out.println(value);

            if(value.equals("cat")){
                it.remove();
            }
        }

        System.out.println();
        /// Modern iteration, Java 5 and later
        for (String animal: animals){
            System.out.println(animal);
        }

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

    }
}
