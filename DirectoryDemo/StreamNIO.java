import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.stream.Stream;
public class StreamNIO {
    public static void main(String[] args){
        try{
            Path p = Paths.get("C:\\Dataset");
            Stream<Path> str = Files.list(p);
            str.forEach(x->{
                String name = x.getFileName().toString();
                String token[] = name.split("\\.");
                String extension = token[token.length-1];
                try{
                    Path d = Paths.get(x.getParent()+"\\"+extension);
                    Files.createDirectory(d);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
        });
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
