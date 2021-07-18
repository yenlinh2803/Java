import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException{
        String fileName = "/Users/linhtrinh/Documents/GitHub/Java/learning/Tutorial33_ReadingTextFiles/src/test_java.txt";
        File textFile = new File(fileName);

        try {
            Scanner in = new Scanner(textFile);
//            String  value = in.nextLine();
//            System.out.println("Read value "+value);
            int count = 0;
            while(in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(count + " nb line: "+line);
                count++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }


        String fileName2 = "/Users/linhtrinh/Documents/GitHub/Java/learning/Tutorial33_ReadingTextFiles/src/text_test.txt";
        File textFile2 = new File(fileName2);
        try {
            Scanner in2 = new Scanner(textFile2);
            while(in2.hasNextLine()) {
                String line2  = in2.nextLine();
                System.out.println(line2);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }
}
