package com.ybennun.javaobjectsasmethodparameters;

public class Main {
    public static void main(String[] args) {
        Employer bank = new Employer();

        Employee jenna = new Employee(
                "Jenna",
                "Lassoft",
                324587,
                "HR",
                "Recruiter",
                4500.89);

        Employee lance = new Employee(
                "Lance",
                "K.",
                3245377,
                "IT",
                "Support",
                3800.59);

        bank.calculateAnnualBonus(jenna);
        bank.calculateAnnualBonus(lance);

        System.out.println(bank.areRelated(jenna,lance));
    }
}