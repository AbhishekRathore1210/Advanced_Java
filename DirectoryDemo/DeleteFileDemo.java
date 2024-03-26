// package DirectoryDemo;
import java.util.*;
import java.nio.file.*;

public class DeleteFileDemo {
    public static void main(String[] args) throws Exception{
        Path p = Paths.get("C:\\KE093");
        Files.delete(p);
        System.out.println("File Deleted..");
    }
}
