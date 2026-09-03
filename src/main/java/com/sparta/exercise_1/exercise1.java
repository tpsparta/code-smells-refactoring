package com.sparta.exercise_1;

import java.util.ArrayList;
import java.util.HashMap;

public class exercise1 {
    
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};

        numbers[2] = 100;

        System.out.println(numbers[0]);

        for (Integer n : numbers) {
            System.out.println(n);
        }

        System.out.println();

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        intList.set(2, 100);

        for (int n: intList) {
            System.out.println(n);
        }

        HashMap<String, Integer> months = new HashMap<>();

        months.put("January", 31);
        months.put("February", 28);
        months.put("March", 31);

        System.out.println(months.get("February"));

        months.put("February", 29);

        System.out.println(months.get("February"));

        //  Create a HashMap containing the months of the year with the number of days in each month - February should have the value of 28. Display February to the console as February=28.
        //  Change the value for February to 29 and display to the console.

    }

}
