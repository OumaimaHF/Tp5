package ma.education.tp5.collections;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("ABC1");
        set1.add("ABC2");
        set1.add("ABC3");
        // set1.add("ABC1");
        set1.add("ABC4");
        set1.add("ABC5");
        set1.forEach(System.out::println);


        Set<Client> set2 = new HashSet<>();
        set2.add(new Client(1,"Oumaima"));
        set2.add(new Client(1,"Hafid"));
        set2.add(new Client(2,"Sara"));
        set2.forEach(System.out::println);


        Set<Integer> set3 = new TreeSet<>();
        set3.add(22);
        set3.add(11);
        set3.add(15);
        set3.add(9);
        set3.forEach(System.out::println);


        Set<Client> set4 = new TreeSet<>(Comparator.comparingInt(c -> c.code));
        set4.add(new Client(1,"Oumaima"));
        set4.add(new Client(3,"Hafid"));
        set4.add(new Client(2,"Sara"));
        set4.forEach(System.out::println);
    }
}
