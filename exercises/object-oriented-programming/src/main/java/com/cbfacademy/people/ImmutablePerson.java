package com.cbfacademy.people;

import java.util.ArrayList;

public class ImmutablePerson {
    String firstName;
    String lastName;
    String middleName;
    ArrayList<String> nicknames;

    // constructor for firstName and lastName only (as both required)
    public ImmutablePerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // constructor for when firstName, lastName and middleName entered
    public ImmutablePerson(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    // constructor for when firstName, lastName and nicknames entered
    public ImmutablePerson(String firstName, String lastName, ArrayList<String> nicknames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nicknames = nicknames;
    }

    // constructor for when all attributes entered
    public ImmutablePerson(String firstName, String lastName, String middleName, ArrayList<String> nicknames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nicknames = nicknames;
    }

    public static void main(String[] args) {
        ImmutablePerson kirsty = new ImmutablePerson("Kirsty", "Abhus");
        
        // nicknames ArrayList is created and initialised with the desired nicknames for osaro, then added
        // to the ArrayList
        ArrayList<String> osaroNicknames = new ArrayList<>();
        osaroNicknames.add("isi");
        osaroNicknames.add("o");
        // when instantiating the ImmutablePerson object for Osaro, the "osaroNickname"
        // ArrayList is passed as an argument to the constructor
        ImmutablePerson osaro = new ImmutablePerson("osaro", "abhus", osaroNicknames);

        System.out.println(osaro.nicknames);
    }
}
