package com.company;

public class User {
    private String name;
    private boolean isAdmin;
    private int salary;

    public User(){}

    public User(String name, boolean isAdmin, int salary) {
        this.name = name;
        this.isAdmin = isAdmin;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
