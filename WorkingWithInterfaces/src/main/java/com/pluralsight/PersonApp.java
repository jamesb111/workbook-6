package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;


public class PersonApp {
    public static void main(String[] args) {
        ArrayList<Person> family = new ArrayList<>();
        family.add(new Person("Johnny", "Dang", 67));
        family.add(new Person("Tommy", "Johnson", 30));
        family.add(new Person("Gerald", "Huston", 31));
        family.add(new Person("Clark", "Kent", 33));
        family.add(new Person("Bruce", "Wayne", 29));
        family.add(new Person("Peter", "Parker", 21));

        Collections.sort(family);

        for(Person per : family) {
            System.out.println(per.getFirstName() + "-" + per.getAge());
        }
    }
}
