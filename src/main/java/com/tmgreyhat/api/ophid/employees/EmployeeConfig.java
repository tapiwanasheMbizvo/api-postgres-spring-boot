package com.tmgreyhat.api.ophid.employees;

import com.tmgreyhat.api.Teacher.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner employeeLoader(EmployeeRepository employeeRepository){

        return  args -> {

            employeeRepository.save(
                    new Employee(

                            "Tapiwanashe Mbizvo",
                            "tmbizvo@ophid.co.zw",
                            "Central Office",
                            "119",
                            "IT",
                            "Java Developer"

                    )
            );

        };
    }
}
