package com.pluralsight;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("Robert", "Smith", 20));
        personList.add(new Person("Anthony", "Rogers", 34));
        personList.add(new Person("Billy", "Bones", 49));
        personList.add(new Person("William", "Turner", 17));
        personList.add(new Person("Velma", "Tyrell", 22));
        personList.add(new Person("Jeremy", "Leonard", 34));
        personList.add(new Person("Stephanie", "Morris", 55));
        personList.add(new Person("William", "Herald", 90));
        personList.add(new Person("Anthony", "Anderson", 29));
        personList.add(new Person("Jazz", "Jones", 34));

        //get average-----------------------------------------
        int ageTotal = personList.stream()
                .mapToInt(person -> person.getAge())
                .sum();
        System.out.println("The average of ages is: " + ageTotal / personList.size());

        //loop version
//        int sum = 0;
//        int avg;
//        for(Person p: personList) {
//            sum += p.getAge();
//        }
//        System.out.println("The average of ages is: " + sum / personList.size());

        //get max age---------------------------------------------------
        OptionalInt max = personList.stream()
                .mapToInt(person -> person.getAge())
                .max();
        System.out.println("Max age is: " + max.getAsInt());

        //loop version
//        int max = 0;
//        for(Person p: personList) {
//            if(p.getAge() > max) {
//                max = p.getAge();
//            }
//        }
//        System.out.println("Max age is: " + max);

        //get minimum age-------------------------------------------------
        OptionalInt min = personList.stream()
                .mapToInt(person -> person.getAge())
                .min();
        System.out.println("Youngest age is: " + min.getAsInt());

        //loop version
//        int min = 200;
//        for(Person p: personList) {
//            if(p.getAge() < min) {
//                min = p.getAge();
//            }
//        }
//        System.out.println("Youngest age is: " + min);

        // prompt and loop for name matches
//        System.out.print("Enter a first or last name to search: ");
//        String nameEntered = scan.nextLine();
//
//        ArrayList<Person> names = new ArrayList<>();
//        for(Person p: personList) {
//            if (p.getFirstName().equalsIgnoreCase(nameEntered) || p.getLastName().equalsIgnoreCase(nameEntered)) {
//                names.add(p);
//            }
//
//        }
//        System.out.println(names);


    }
}
