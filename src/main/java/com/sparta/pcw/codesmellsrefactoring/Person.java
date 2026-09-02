package com.sparta.pcw.codesmellsrefactoring;

public class Person
{
    private final String firstName;
    private final String lastName;
    private int age;
    private int houseNo = 0;
    private String street = "";
    private String town = "";

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int houseNo, String street, String town) {
        this(firstName, lastName);
        this.houseNo = houseNo;
        this.street = street;
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String move() {
        return "Walking along";
    }

    @Override
    public  String toString() {
        String addressString = "Address: " + houseNo + " " + street + ", "  + town;

        if (addressString.equals("Address: 0 , ")) {
            addressString = "Address: <no address set>";
        }

        return String.format("%s Name: %s Age: %s. %s",
                             super.toString(),
                             getFullName(),
                             age,
                             addressString);
    }

}