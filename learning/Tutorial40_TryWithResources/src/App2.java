import java.io.*;

public class App2 {
    public static void main(String[] args){
        File file = new File("/Users/linhtrinh/Documents/GitHub/Java/learning/Tutorial40_TryWithResources/test.txt");
//        FileReader fr = new FileReader();
//        BufferedReader br = new BufferedReader(fr);
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            //
            String line;
            while((line = br.readLine())!= null ){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("Can't find file "+file.toString());
        } catch (IOException e){
//            e.printStackTrace();
            System.out.println("Unable to read file "+file.toString());
        }

    }
}
