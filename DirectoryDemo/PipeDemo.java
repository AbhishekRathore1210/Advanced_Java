import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
public class PipeDemo {
    public static void main(String[] args) throws IOException{
        Pipe p = Pipe.open();
        Pipe.SinkChannel psink = p.sink();
        String data = "Computer" ;
        ByteBuffer bb = ByteBuffer.allocate(1024);
        bb.clear();
        bb.put(data.getBytes());
        bb.flip();
        while(bb.hasRemaining()){
            psink.write(bb);
        }
        Pipe.SourceChannel psource = p.source();
        bb = ByteBuffer.allocate(1024);
        while(psource.read(bb) > 0){
            char t = (char)bb.get();
            System.out.println(t);
        }
        bb.clear();
    }
}
