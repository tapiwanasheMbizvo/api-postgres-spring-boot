package com.tmgreyhat.api.Teacher;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            allocationSize = 1,
            sequenceName = "teacher_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
    )
    private Long id;

    private  String name;

    private String qualification;

    private String email;

    private  Double salary;


    public Teacher() {
    }

    public Teacher(
            String name,
            String qualification,
            String email,
            Double salary) {
        this.name = name;
        this.qualification = qualification;
        this.email = email;
        this.salary = salary;
    }

    public Teacher(
            Long id,
            String name,
            String qualification,
            String email,
            Double salary) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
        this.email = email;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
