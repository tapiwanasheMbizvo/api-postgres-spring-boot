package com.tmgreyhat.api.Teacher;

import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TeacherService {


    private final TeacherRepository teacherRepository;


    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeachersList(){

        return  teacherRepository.findAll();
    }

    public  Teacher addTeacher( Teacher teacher){

        Optional<Teacher> teacherExistsByEmail = teacherRepository.findTeacherByEmail(teacher.getEmail());

        if (teacherExistsByEmail.isPresent()){

            throw  new IllegalStateException("User with email "+ teacher.getEmail()+" Already exists");
        }

        return  teacherRepository.save(teacher);

    }




}
