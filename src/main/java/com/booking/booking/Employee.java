package com.booking.booking;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.util.comparator.Comparators;

import java.util.*;

public class Employee {

    private int id;
    private String name;
    private String department;
    private String city;
    private double salary;
    private int age;

    public Employee(int id, String name, String department, String city, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.city = city;
        this.salary = salary;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getCity() { return city; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }
    
    public static void main(String args[]) {
    List<Employee> employees = Arrays.asList(

    	    new Employee(1,"Arun","HR","Chennai",60000,28),
    	    new Employee(2,"Bala","IT","Bangalore",90000,30),
    	    new Employee(3,"Charan","Finance","Hyderabad",75000,35),
    	    new Employee(4,"David","HR","Chennai",80000,40),
    	    new Employee(5,"Esha","IT","Mumbai",95000,29),
    	    new Employee(6,"Farah","Finance","Delhi",72000,32),
    	    new Employee(7,"Ganesh","IT","Chennai",88000,31),
    	    new Employee(8,"Hari","HR","Bangalore",67000,27),
    	    new Employee(9,"Isha","IT","Hyderabad",91000,33),
    	    new Employee(10,"John","Finance","Mumbai",73000,36),
    	    new Employee(11,"Arun","HR","Delhi",61000,29),   // duplicate name
    	    new Employee(12,"Bala","IT","Chennai",87000,34)  // duplicate name
    	);
    
//        Find the occurrence of names of employees and the frequency of each name.
    
    Map<String, Long> sorted = employees.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
    
    	
    	
    	sorted.forEach((key, value) -> System.out.println(key+"-"+value));
}
    
}


