package com.employee.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int eno;
    private String firstName;
    private String lastName;
    private String department;
    private int age;
    private Address address;

    public Employee() {

    }
}
