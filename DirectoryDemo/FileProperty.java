import java.nio.file.*;
public class FileProperty {
    public static void main(String[] args){
        Path p = Paths.get("C:\\Data\\test.txt");
        System.out.println(p);
        System.out.println(p.getFileName());
        System.out.println(p.getName(0));
        System.out.println(p.subpath(0, 2));
        System.out.println(p.getParent());
        System.out.println(p.getRoot());
        
    }
}
