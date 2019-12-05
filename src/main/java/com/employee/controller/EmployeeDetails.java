package com.employee.controller;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.employee.model.Employee;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class EmployeeDetails {
    public static List<Employee> convertObjectToJson() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue( new File( "/Users/sandhya/myprojects/Employee/src/main/resources/employee.json" ), new TypeReference<List<Employee>>() {
        } );
    }

    public static List<Employee> getEmployeesListByTheirPostcode(List<Employee> employees) {

        return employees.stream().filter( e -> e.getAddress().getPostCode().equals( "RM6 6DL" ) ).collect( Collectors.toList() );

    }

    public static Map<String, List<Employee>> getEmployeesMapByTheirPostCodes(List<Employee> employees) {

        return employees.stream().collect( Collectors.groupingBy( e -> e.getAddress().getPostCode() ) );

    }

    public static List<Employee> getEmployeesByTheirAge(List<Employee> employees) {

        return employees.stream().filter( e -> e.getAge() > 30 ).collect( Collectors.toList() );

    }

    public static List<Employee> getEmployeeId(List<Employee> employees) {

        return employees.stream().filter( e -> e.getAddress().getPostCode().equals( "RM6 5AB" ) ).collect( Collectors.toList() );

    }

}
