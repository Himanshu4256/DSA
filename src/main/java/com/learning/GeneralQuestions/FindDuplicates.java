package com.learning.GeneralQuestions;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,2,4,9);
//        Set<Integer> set = new HashSet<>();
//        List<Integer> collect = numbers.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
//        System.out.println(collect);

        Set<Integer> collect = numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
