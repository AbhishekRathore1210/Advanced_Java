// package DirectoryDemo;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryDemo{
    public static void main(String[] args){
        try{
            Path p = Paths.get("C:\\Data");
            if(Files.exists(p)){
                System.out.println("Already Exists...");
            }
            else{
                Path pp = Files.createDirectory(p);
                System.out.println("Directory Created..");
            }
        }   
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}
