// package DirectoryDemo;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class WriteLines {
    public static void main(String[] args){
        try{
            Path p = Paths.get("C:\\KE093\\test.txt");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            // String data = "Hello How are you?";
            Files.write(p,input.getBytes());
        }   
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}
