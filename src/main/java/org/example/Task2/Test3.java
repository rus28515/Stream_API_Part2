package org.example.Task2;

import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<Integer>list = List.of(1,5,3,7,5,9,6);

        list = list.stream().sorted((e1,e2)-> {
            return e2-e1;
        }).collect(Collectors.toList());

        System.out.println(list);
    }
}
