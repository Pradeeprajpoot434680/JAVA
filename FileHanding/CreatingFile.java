import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String arg[]) throws IOException{
        // File file = new File("myFile.txt");

        // System.out.println(file.exists());
        // System.out.println(file.getAbsolutePath());
        // System.out.println(file.getName());
        // System.out.println(file.canRead());
        // System.out.println(file.canWrite());
        // System.out.println(file.isFile());
        // System.out.println(file.isDirectory());
        // System.out.println(file.length());


        // if(file.createNewFile()){
        //     System.out.println("File Created");
        // }
        // else {
        //     System.out.println("File Already Exist");
        // }


        // System.out.println(file.isFile());


        // File dir = new File("directory");

        // if(dir.mkdir()){
        //     System.out.println("Dir created");
        // }
        // else {
        //     System.out.println("Alredy created");
        // }



        // see all files and dir in the directory

        // File dir = new File(".");

        // String[] names = dir.list();

        // if (names != null) {
        //     for (String name : names) {
        //         System.out.println(name);
        //     }
        // }

        // see all file

        // File file = new File(".");
        // File[] files = file.listFiles();

        // if(files != null){
        //     for(File f : files){
        //         System.out.println(f.getName());
        //     }
        // }


        // delete or Rename a file

        // File file = new File("myFile.txt");
        // if(file.delete()){
        //     System.out.println("File deleted");
        // }
        // else {
        //     System.out.println("Deletion Failed");
        // }

        File f = new File("file.txt");
        f.createNewFile();

        File oldFile = new File("file.txt");
        File newFile = new File("renamedFile.txt");

        if(oldFile.renameTo(newFile)){
            System.out.println("Name CHanged");
        }
        else {
            System.out.println("Failed");
        }


    }
}