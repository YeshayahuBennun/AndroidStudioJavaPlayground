package com.ybennun.javainheritence;

public class Employee extends Person {
    private int id;
    private double annualSalary;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", annualSalary=" + annualSalary +
                '}';
    }
}
