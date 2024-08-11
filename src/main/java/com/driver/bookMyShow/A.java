package com.driver.bookMyShow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        Employee e1 =new Employee();
        e1.setId(1);
        e1.setName("mike");
        Employee e2 =new Employee();
        e2.setId(2);
        e2.setName("adam");

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);

        List<EmployeeDto> dtos = employees.stream().map(e -> convertToDto(e)).collect(Collectors.toList());
        System.out.println(dtos);

    }

    static EmployeeDto convertToDto(Employee e){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(e.getId());
        employeeDto.setName(e.getName());
        return employeeDto;
    }
}
