package com.tmgreyhat.api.ophid.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employees")
public class EmployeeController {

    private  final  EmployeeService employeeService;


    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){

        return  employeeService.getEmployeeList();
    }

    @GetMapping(path = "{id}")
    public  Employee getOneEmployee(@PathVariable(name = "id") Long id){

        return  employeeService.getOneEmployee(id);

    }

    @PostMapping
    public Employee createOneEmployee(@RequestBody Employee employee){


        return  employeeService.createEmployee(employee);

    }

    @PutMapping
    public  Employee editEmployeeDetails (@RequestBody Employee employee){

        return  employeeService.editEmployeeDetails(employee);

    }

    @DeleteMapping(path = "{id}")
    public  void deleteEmployee(@PathVariable(name = "id") Long id){


        employeeService.deleteOneEmployee(id);
    }


}
