package com.ybennun.javainheritence;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setAge(45);
        employee.setId(123544);
        employee.setAnnualSalary(100000);

        System.out.println(employee.getAnnualSalary());

        Manager manager = new Manager();
        manager.setFirstName("Manager George");
        manager.setLastName("Kilos");
        manager.setAge(35);
        manager.setId(456);
        manager.setAnnualSalary(450000);


        System.out.println(manager.getAnnualSalary() + " , " + manager.getFirstName() + "id: " + manager.getId());

        System.out.println(manager);

    }
}