package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(23);
        list1.add(23);
        list1.add(12);


        list1.forEach(System.out::println);
        List<Integer> list2 = Arrays.asList(1, 5, 6, 9, 16);
        list2.stream().map(i-> i * i).filter(i-> i > 37).forEach(System.out::println);


        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2,10);
        list3.forEach(System.out::println);
    }
}
