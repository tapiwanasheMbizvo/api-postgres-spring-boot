package com.tmgreyhat.api.ophid.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    private final  EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployeeList() {
        return  employeeRepository.findAll();
    }

    public Employee getOneEmployee(Long id) {

        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(!employeeOptional.isPresent()){
            throw  new IllegalStateException("Employee not found");

        }

        return  employeeRepository.getById(id);
    }
}
