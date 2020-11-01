import java.util.HashSet;
import java.util.Set;

public class PersonMain {

    public static void main(String[] args) {
        Set<Person> pSet = new HashSet<>();
        Person p = new Person("Bob", 1);
        pSet.add(p);
        pSet.add(new Person("Bob", 1));
        System.out.println(pSet);

        System.out.println(p==(new Person("Bob", 1)));


    }


}
