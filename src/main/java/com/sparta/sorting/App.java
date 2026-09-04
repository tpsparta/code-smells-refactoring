package com.sparta.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        List<String> firstNames = new ArrayList<>(
            List.of("Carol", "Brenda", "Jeffrey", "Albert", "Terry")
        );

        Collections.sort(firstNames);

        firstNames.forEach(System.out::println);

        Person john = new Person("John", "Doe");
        Person joe = new Person("Joe", "Bloggs");
        Person frank = new Person("Frank", "Bloggs");


        
        List<Person> people = new ArrayList<>(List.of(john, frank, joe));

        Comparator<Person> personComparator = (o1, o2) -> {
            int res = o1.getLastName().compareTo(o2.getLastName());
            if (res == 0) {
                res = o1.getFirstName().compareTo(o2.getFirstName());
            }
            return res;
        };

        Collections.sort(people, personComparator);
        
        people.forEach(System.out::println);
                
    }


    // private static int compareToUTF16Values(byte[] value, byte[] other, int len1, int len2) {
    //     int lim = Math.min(len1, len2);
    //     for (int k = 0; k < lim; k++) {
    //         char c1 = getChar(value, k);
    //         char c2 = StringUTF16.getChar(other, k);
    //         if (c1 != c2) {
    //             return c1 - c2;
    //         }
    //     }
    //     return len1 - len2;
    // }
    
}
