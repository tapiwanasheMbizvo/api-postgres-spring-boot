package com.tmgreyhat.api.ophid.employees;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employees_sequence",
            allocationSize = 1,
            sequenceName = "employees_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employees_sequence"
    )
    private Long id;

    private  String name;

    private String email;
    private String location;
    private String extension;
    private String department;
    private String title;

    public Employee() {
    }

    public Employee(
            String name,
            String email,
            String location,
            String extension,
            String department,
            String title) {
        this.name = name;
        this.email = email;
        this.location = location;
        this.extension = extension;
        this.department = department;
        this.title =title;

    }

    public Employee(
            Long id,
            String name,
            String email,
            String location,
            String extension,
            String department,
            String title) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.location = location;
        this.extension = extension;
        this.department = department;
        this.title =title;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", extension='" + extension + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
