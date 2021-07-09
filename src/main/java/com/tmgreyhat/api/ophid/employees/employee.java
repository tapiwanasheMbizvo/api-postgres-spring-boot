package com.tmgreyhat.api.ophid.employees;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "employees")
public class employee {

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

}
