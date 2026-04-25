package com.learning.GeneralQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValue {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();

        map.put("A",20);
        map.put("B", 42);
        map.put("E", 30);
        map.put("C",50);
        map.put("S",55);

        LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            collect.forEach((key,value)->
                    System.out.println(key+ " "+ value));
    }
}
