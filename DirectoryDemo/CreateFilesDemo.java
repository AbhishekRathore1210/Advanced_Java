import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class CreateFilesDemo {
    public static void main(String[] args){
        try{
            Path p = Paths.get("C:\\Users\\Acer\\OneDrive - Lovely Professional University\\Desktop\\abc.txt");
            if(Files.exists(p)){
                System.out.println("File already Exists");
            }
            else{
                Path pp = Files.createFile(p);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
