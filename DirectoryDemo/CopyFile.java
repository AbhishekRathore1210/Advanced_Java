import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class CopyFile {
    public static void main(String[] args){
        try{
            System.out.println("Start : "+new Date());
        Path source = Paths.get("C:\\Users\\Acer\\Documents\\Camera");
        Path desti = Paths.get("C:\\Dataset\\CameraPaste");
        Files.copy(source,desti);
        System.out.println("End : "+new Date());

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
