package dev.fullstackcode.eis.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer gender_id;
    private Integer job_id;
    private String name;
    private String last_name;

    //@Enumerated(EnumType.STRING)
    //private Gender gender_id;

    private LocalDate birthdate;
    //private LocalDate hire_date;

    /*@ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;*/



    public Employee() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /*public Gender getGender() {
        return gender_id;
    }

    public void setGender(Gender gender_id) {
        this.gender_id = gender_id;
    }*/
    
    public Integer getGender() {
        return gender_id;
    }

    public void setGender(Integer gender_id) {
        this.gender_id = gender_id;
    }
    
    public Integer getJob() {
        return job_id;
    }

    public void setJob(Integer job_id) {
        this.job_id = job_id;
    }

    public LocalDate getBirth_date() {
        return birthdate;
    }

    public void setBirth_date(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /*public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }*/



}