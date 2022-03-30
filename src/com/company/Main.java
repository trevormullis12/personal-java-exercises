package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        RegexTestHarness regTest = new RegexTestHarness();
//        regTest.test();
        Warmup warmup = new Warmup();
        System.out.println(warmup.areaOrPerimeter(6, 10));
        System.out.println(warmup.areaOrPerimeter(3, 3));
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Fred", true, 20000));
        users.add(new User("Cathy", false, 40000));
        users.add(new User("Sally", true, 80000));
        users.add(new User("Kyle", true, 50000));
        users.add(new User("Cynthia", false, 100000));

        System.out.println(warmup.returnAvgAdminSalary(users));

    }
}
