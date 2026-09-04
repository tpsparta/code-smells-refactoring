package com.sparta.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");

        HashSet<String> names = new HashSet<>(
            List.of("Terry", "Cathy", "John", "Cathy", "Terry", "John", "Cathy", "Terry")
        );
        
        System.out.println(names.contains("Terry"));

        Map<Character, Integer> lettersCount = new HashMap<>();

        for (Map.Entry<Character,Integer> entry: lettersCount.entrySet()) {
            System.out.println(entry);
        }

        // public static void main(String[] args) {
        //     int[] numbers = new int[2];
        //     numbers[0] = 1;
        //     numbers[1] = 2;
        //     System.out.println(Arrays.toString(numbers));

        //     int[] numberPlus = new int[5];

        //     Arrays.stream(numbers).forEach(System.out::println);

    }

}