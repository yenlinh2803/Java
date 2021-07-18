import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        String text = map.get(1);
        System.out.println(text);
        System.out.println(new String(map.get(5)));

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": "+value);

        }


    }
}
