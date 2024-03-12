import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Str{
    public static void main(String[] args) {
       List<Integer> list1 = Arrays.asList(10,15,7,6,4,23,27); 
       List<Integer> oddlist = new ArrayList<>();
       for(Integer a:list1){
        if(a%2==1){
            oddlist.add(a);
        }
       }
       System.out.println(list1);
       System.out.println(oddlist);

       // with Stream
        Stream<Integer> strm1 = list1.stream();
        // Collection<Integer> collect1 = strm1.filter(n->n%2==1).collect(Collectors.toList());
        // System.out.println(collect1);
        strm1.filter(n->n%2==0).forEach(n->System.out.println(n));
    }
}