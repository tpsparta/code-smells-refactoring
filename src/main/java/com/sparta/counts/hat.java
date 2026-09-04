package com.sparta.counts;

import java.util.HashMap;

public class hat {
    
    public static void main(String[] args) {

        String message = "The cat in the hat comes back"
            .trim()
            .toLowerCase();

        HashMap<Character, Integer> lettersCount = new HashMap<>();

        for (char letter : message.toCharArray()) {
            if (letter != ' ') {
                lettersCount.put(letter, lettersCount.getOrDefault(letter, 0) + 1);
            }
        }

        for (Character key : lettersCount.keySet()) {
            System.out.println(key + ": " + lettersCount.get(key));
        }

    }

}
