import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) throws IOException, ParseException {
        Test test = new Test();

        /*
        try{
            test.run();
        } catch (IOException e){
            // TODO Auto-generate catch block
            e.printStackTrace();
        } catch (ParseException e){
//            e.printStackTrace();
            System.out.println("Couldnt parse command file");
        }
         */


        /*
        try{
            test.run();
        } catch (IOException | ParseException e){
//            e.printStackTrace();
            System.out.println("Couldnt parse command file "+);
        }
        */

        try{
            test.run();
        } catch (Exception e ){
//            e.printStackTrace();
            System.out.println("Error: "+e);
        }

        try{
            test.input();
        } catch(FileNotFoundException e1){
            System.out.println("Error: "+e1);
        } catch(IOException e2){
            System.out.println("Error: "+e2);
        }




    }

}
