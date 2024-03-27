import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class AppendFile {
    public static void main(String[] args){
        try{
            Path p = Paths.get("C:\\Users\\Acer\\OneDrive - Lovely Professional University\\Desktop\\abc.txt");
            String newData = "Lovely Professional University";
            Files.write(p,System.getProperty("Line.separator",newData).getBytes(),StandardOpenOption.APPEND);
            System.out.println("File Appended");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }   
}
