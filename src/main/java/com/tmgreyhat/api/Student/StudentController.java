package com.tmgreyhat.api.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private  final  StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService ) {

       this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudentsList(){
        return  studentService.getStudentsList();

    }
    @GetMapping(path = "{id}")
    public Optional<Student> getOneStudent(@PathVariable(name = "id") Long id){

        return  studentService.getOneStudent(id);

    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public  Student addStudent(@RequestBody  Student student){
      return   studentService.addNewStudent(student);

    }
    @DeleteMapping (path = "{id}")
    public  void deleteStudent(@PathVariable(name = "id") Long id){

         studentService.removeStudent(id);

    }

    @PutMapping
    @Transactional
    public  Student updateStudent(@RequestBody Student student){

        return  studentService.updateStudent(student);
    }


}
