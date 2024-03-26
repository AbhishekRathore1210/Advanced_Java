import java.nio.file.*;
import java.util.List;
public class CopyFileFromOneToAnother {
    public static void main(String... args){
        try{
        Path p = Paths.get("C:\\Data\\test.txt");
        Path pp = Paths.get("C:\\Users\\Acer\\OneDrive - Lovely Professional University\\Desktop\\abc.txt");
        List<String> s = Files.readAllLines(p);
        Files.write(pp,s);
        System.out.println("Successfully Copied");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
