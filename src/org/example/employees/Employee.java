package org.example.employees;

public class Employee {
    static int id;
     String name;
     int empId;
     String department;
     double salary;
    // I have to choices for constructor
   /* public Employee(){
        id++;
        empId = id;
    }*/
    public Employee(String name, String department, double salary){
        id++;
        empId = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void display(){
        System.out.println("name = " + name);
        System.out.println("empId = " + empId);
        System.out.println("department = " + department);
        System.out.println("salary = " + salary);
    }
}
