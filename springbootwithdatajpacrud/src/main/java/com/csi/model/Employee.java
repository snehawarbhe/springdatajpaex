package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLOYEE")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int empId;

    private String empName;

    private double empSalary;

    private String empAddress;

    private long empContactNumber;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    private String empEmailId;

    private String empPassword;


}
