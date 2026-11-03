import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        // write

        // try(FileWriter writer = new FileWriter("notes.txt")){
        //     writer.write("Hello world\n");
        //     writer.write("Hello How are you");
        // }
        // catch(IOException e){
        //     System.out.println(e);
        // }


        // append

        // try(FileWriter writer = new FileWriter("notes.txt",true)){
        //     writer.write("Appended Data\n");
        // }
        // catch(IOException e){
        //     System.out.println(e);
        // }


        // Read FIle

        try(FileReader reader = new FileReader("notes.txt")){
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char)ch);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
