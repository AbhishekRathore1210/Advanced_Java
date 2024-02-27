import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.*;

public class str1 {
    public static void main(String[] args){
        ArrayList<Integer> al  = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(2);
        al.add(5);
        al.add(1);
        al.add(7);
        Stream<Integer> st = al.stream(); // create a sequential stream
        st = st.distinct().filter((x)->x%2==1).sorted((x,y) -> x>y ? -1:1);
        st.forEach( a-> System.out.println(a));
    }
}
