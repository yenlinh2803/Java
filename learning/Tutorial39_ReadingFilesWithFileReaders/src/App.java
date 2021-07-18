import java.io.*;

public class App {
    public static void main(String[] args){
        File file  = new File("/Users/linhtrinh/Documents/GitHub/Java/learning/Tutorial39_ReadingFilesWithFileReaders/text.txt");
//        File file  = new File("text.txt");
        BufferedReader br = null ;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line ;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e){
//            e.printStackTrace();
            System.out.println("File not found: "+ file.toString());
//            System.out.println("Error: "+e);
        } catch (IOException e ){
            System.out.println("Unable to read file: "+file.toString());
        }
        finally{
            try{
                br.close();
            } catch(IOException e){
//            e.printStackTrace();
                System.out.println("Unable to close file: "+file.toString());
            } catch(NullPointerException ex){
                // File was probably never opened!
            }

        }





    }
}
