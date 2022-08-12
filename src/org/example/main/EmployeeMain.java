package org.example.main;
import org.example.employees.Employee;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        /*
        Employee employee = new Employee();
        employee.name = "Vaibhav";
        employee.empId = 12;// by mistake update, because its accessible
        employee.department = "Accounts";
        employee.salary = 20000;
        */
      /*
        Employee employee1 = new Employee("Vaibhav", "Accounts", 20000);
        Employee employee2 = new Employee("Ramesh", "HR", 50000);
        Employee employee3 = new Employee("Suresh", "HR", 50000);
        Employee employee4 = new Employee("Anil", "Maintenance", 25000);
        Employee employee5 = new Employee("Akash", "Delivery", 30000);
        employee1.display();
        employee2.display();
        employee3.display();
        employee4.display();
        employee5.display();
        */
        //array
        //type[] arrayName;
        Employee[] employees = new Employee[5];
        int[] marks = new int[5];
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(employees));
        //scanner for user input
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("enter name of employee");
            String name = scanner.nextLine();
            System.out.println("enter department of empoyee");
            String department = scanner.nextLine();
            System.out.println("enter salary of employee");
            double salary = scanner.nextDouble();
            //read blank line
            scanner.nextLine();
            employees[i] = new Employee(name, department, salary);
        }
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
            System.out.println();
        }
    }
}
