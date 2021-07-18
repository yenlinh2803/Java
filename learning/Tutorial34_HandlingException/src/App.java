
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String pathName = "/Users/linhtrinh/Documents/GitHub/Java/learning/Tutorial33_ReadingTextFiles/src/text_test.txt";
//        String pathName = "test.text";
        File file = new File(pathName);
        try{
            FileReader fr = new FileReader(file);
            System.out.println("Continuing...");
        } catch (FileNotFoundException ex){
            System.out.println("file not found: "+file.toString());
        }

//        try {
//            openFile();
//        } catch (FileNotFoundException e){
//            System.out.println("Could not open file");
//        }
    }
//    public static void openFile(){
//        String pathName = "/Users/linhtrinh/Documents/GitHub/Java/learning/Tutorial33_ReadingTextFiles/src/text_test.txt";
//        File file =new File(pathName);
//        FileReader fr = new FileReader(file);
//    }
}
