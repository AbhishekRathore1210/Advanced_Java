import java.util.ArrayList;
import java.util.stream.*;
class Employee{
    public String name;
    public int salary;
    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
}
public class str2 {
    public static void main(String[] args){
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Ravi", 69));
        al.add(new Employee("Ajay", 51));
        al.add(new Employee("Mandeep", 75));
        al.add(new Employee("Richa", 95));
        al.add(new Employee("Chhavi", 80));

        Stream<Employee> st = al.stream();
        st = st.filter(e -> e.salary < 80).sorted((x,y) -> (x.name.compareTo(y.name)));
        st.forEach(e->System.out.println(e.name));
    }
}
