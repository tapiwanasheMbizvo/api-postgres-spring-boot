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
            throw  new IllegalStateException("Employee not found with id "+id);

        }

        return  employeeRepository.getById(id);
    }

    public Employee createEmployee(Employee employee) {

        Optional<Employee> employeeOptional = employeeRepository.findEmployeeByEmail(employee.getEmail());

        if(employeeOptional.isPresent()){

            throw new IllegalStateException("Employee with email "+employee.getEmail()+" Already exists");

        }


        return  employeeRepository.save(employee);
    }

    public Employee editEmployeeDetails(Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(employee.getId());
        if(!employeeOptional.isPresent()){
            throw  new IllegalStateException("Employee not found with id "+employee.getId());

        }

        return  employeeRepository.save(employee);
    }

    public void deleteOneEmployee(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(!employeeOptional.isPresent()){
            throw  new IllegalStateException("Employee not found with id "+id);

        }

        employeeRepository.deleteById(id);

    }
}
