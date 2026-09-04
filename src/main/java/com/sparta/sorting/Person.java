package com.sparta.sorting;

public class Person implements Comparable<Person>
{
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return this.getFullName();
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

}
