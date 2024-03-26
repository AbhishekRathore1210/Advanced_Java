import java.nio.file.*;
import java.util.List;
public class ReadFiles {
    public static void main(String[] args){
        try{
            Path p = Paths.get("C:\\KE093\\test.txt");
            List<String> data = Files.readAllLines(p);
            for(String s:data)System.out.println(s);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
