package com.sparta.sorting;

import java.util.Comparator;

public class SortPersonByName implements Comparator<Person> {

    private static int comparePeople(String a, String b) {
        int lim = Math.min(a.length(), b.length());
        for (int k = 0; k < lim; k++) {
            char c1 = a.charAt(k);
            char c2 = b.charAt(k);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return a.length() - b.length();
    }

    @Override
    public int compare(Person o1, Person o2) {

        //  Sort by last name, then first name.

        int res = o1.getLastName().compareTo(o2.getLastName());

        if (res == 0) {
            res = o1.getFirstName().compareTo(o2.getFirstName());
        }

        return res;

    }

        

}
