import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        Set --->  collections
        Set<String> collectionOfSet = new HashSet<>();
        collectionOfSet.add("abc");
        collectionOfSet.add("abcd");
        //calculates the hash value if finds the same hash code
        //then only it calls equals
        collectionOfSet.add("abc");
        System.out.println(
                collectionOfSet
        );

    }
}