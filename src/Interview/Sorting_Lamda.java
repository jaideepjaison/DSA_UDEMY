package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting_Lamda {
    public static void main(String[] args) {
            List<Integer> names = Arrays.asList(2,1,5);

       names.sort((Integer a, Integer b)->a.compareTo(b));


        System.out.println("names :"+names+"\n"+"-------------");

        List<Integer> arr = Arrays.asList(2,1,5,4,5,3,2);
        int val=7;
        System.out.println("val "+arr.stream().filter(i->i==val).collect(Collectors.toList()));

        // List<Integer> finalarr =arr.stream().sorted().collect(Collectors.toList());

//        System.out.println("finalarr :"+arr.stream().sorted().collect(Collectors.toList()));
//        System.out.println("finalarr :"+arr.stream().filter(i->i%2!=0).collect(Collectors.toList()));
//        System.out.println("finalarr :"+arr.stream().distinct().collect(Collectors.toList()));


    }
}
