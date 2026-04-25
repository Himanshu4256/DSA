package com.learning.GeneralQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberFilter {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,0,-3,2,0,5,-2,0,8,0,-4);
        List<Integer> filteredList = Stream.concat(
                Stream.concat(
                        numbers.stream().filter(n -> n > 0),
                        numbers.stream().filter(n -> n < 0)
                ),
                numbers.stream().filter(n -> n == 0)
        ).collect(Collectors.toList());
        System.out.println(filteredList);
    }

}
