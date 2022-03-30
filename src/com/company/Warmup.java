package com.company;

import java.util.ArrayList;

public class Warmup {
    public int areaOrPerimeter(int a, int b) {
        if(a==b) return a*b;
        return a*2 + b*2;
    }

    //Create a function, returnAvgAdminSalary,
    //that takes in an array of users and returns the average salary of all admins.
    //Round to the nearest dollar.
    public int returnAvgAdminSalary(ArrayList<User> users){
        int avg = 0;
        int numOfAdmins = 0;
        for(int i = 0; i<users.size(); i++){
            if(users.get(i).isAdmin()){
                avg += users.get(i).getSalary();
                numOfAdmins++;
            }
        }
        return avg/numOfAdmins;
    }

}